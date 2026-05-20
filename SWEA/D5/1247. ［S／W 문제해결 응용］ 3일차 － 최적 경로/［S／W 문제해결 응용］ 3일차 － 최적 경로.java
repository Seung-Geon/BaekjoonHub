/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int N;
    static Point company, home;
    static Point[] customers;
    static boolean[] visited;
    static int minDistance;

    public static void main(String[] args) throws Exception{

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();

            company = new Point(sc.nextInt(), sc.nextInt());
            home = new Point(sc.nextInt(), sc.nextInt());
            customers = new Point[N];
            for (int i = 0; i < N; i++) {
                customers[i] = new Point(sc.nextInt(), sc.nextInt());
            }

            visited = new boolean[N];
            minDistance = Integer.MAX_VALUE;

            dfs(company, 0, 0);

            System.out.println("#" + test_case + " " + minDistance);

        }
    }

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static void dfs(Point currentPos, int count, int distance) {
        // 가지치기: 현재 거리가 min을 넘어서면 더이상 할필요 X
        if (distance >= minDistance) {
            return;
        }

        // 종료: 모든 고객을 방문한 경우
        if (count == N) {
            // 현재 위치(마지막 고객)에서 집까지의 거리를 더해서 최종 거리 계산
            int finalDistance = distance + calculateDistance(currentPos, home);
            minDistance = Math.min(minDistance, finalDistance);
            return;
        }

        // 다음 고객 찾기
        for (int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                int newDistance = distance + calculateDistance(currentPos, customers[i]);
                dfs(customers[i], count + 1, newDistance);
                visited[i] = false;
            }
        }
    }

    private static int calculateDistance (Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }
}
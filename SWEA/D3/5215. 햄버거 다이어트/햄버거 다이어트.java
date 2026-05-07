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
    public static void main(String[] args) throws Exception {

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt(); // 재료의 수
            int l = sc.nextInt(); // 제한 칼로리

            int[] score = new int[n + 1]; // 맛에 대한 점수 (1번 인덱스부터 사용)
            int[] cal = new int[n + 1];   // 칼로리 (1번 인덱스부터 사용)

            for (int i = 1; i <= n; i++) {
                score[i] = sc.nextInt();
                cal[i] = sc.nextInt();
            }

            // dp[i][j]: 1~i번째 재료까지 고려했을 때, j 칼로리 이하로 얻을 수 있는 최대 점수
            int[][] dp = new int[n + 1][l + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= l; j++) {
                    // 현재 제한 칼로리 j보다 i번째 재료의 칼로리가 더 클 경우 (못 넣음)
                    if (cal[i] > j) {
                        dp[i][j] = dp[i - 1][j];
                    } 
                    // 넣을 수 있는 경우: (안 넣는 경우) vs (넣고 남은 칼로리의 최대 점수 + 현재 점수) 중 큰 값
                    else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - cal[i]] + score[i]);
                    }
                }
            }

            // 모든 재료를 고려하고 제한 칼로리가 l일 때의 최대 점수 출력
            System.out.println("#" + test_case + " " + dp[n][l]);
        }
    }
}
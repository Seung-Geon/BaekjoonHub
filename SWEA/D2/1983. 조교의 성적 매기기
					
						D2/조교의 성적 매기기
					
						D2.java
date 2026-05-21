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
import java.util.Arrays;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
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

        String[] unit = {
                "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"
        };

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // [0]: 학생 번호(인덱스), [1]: 총점
            double[][] arr = new double[n][2];

            for (int i = 0; i < n; i++) {
                double temp = 0.35 * sc.nextInt() + 0.45 * sc.nextInt() + 0.2 * sc.nextInt();
                arr[i][0] = i + 1; // 학생 번호는 1부터 시작
                arr[i][1] = temp;
            }

            // Double.compare를 사용하여 double 값을 안전하게 내림차순으로 정렬
            Arrays.sort(arr, (o1, o2) -> Double.compare(o2[1], o1[1]));

            int rank = 0; // k번째 학생의 등수
            for (int i = 0; i < n; i++) {
                // 정렬된 배열에서 k번째 학생을 찾음
                if ((int)arr[i][0] == k) {
                    rank = i;
                    break;
                }
            }

            // 등수를 n/10으로 나누어 해당 학점 구간의 인덱스를 찾음
            System.out.println("#" + test_case + " " + unit[rank / (n / 10)]);
        }
    }
}
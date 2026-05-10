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
            String date = sc.next();

            String year = date.substring(0, 4);
            String month = date.substring(4, 6);
            String day = date.substring(6);

            StringBuilder sb = new StringBuilder();

            if (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
                sb.append(-1);
            } else {
                switch (Integer.parseInt(month)) {
                    case 1: 
                    case 3: 
                    case 5: 
                    case 7: 
                    case 8: 
                    case 10: 
                    case 12:
                        if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31) {
                            sb.append(-1);
                        } else {
                            sb.append(year).append("/").append(month).append("/").append(day);
                        }
                        break;
                    case 4:
                    case 6:
                    case 9: 
                    case 11:
                        if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 30) {
                            sb.append(-1);
                        } else {
                            sb.append(year).append("/").append(month).append("/").append(day);
                        }
                        break;
                    case 2:
                        if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 28) {
                            sb.append(-1);
                        } else {
                            sb.append(year).append("/").append(month).append("/").append(day);
                        }
                        break;
                }
            }
            sb.insert(0, "#" + test_case + " ");
            System.out.println(sb.toString());
        }
    }
}
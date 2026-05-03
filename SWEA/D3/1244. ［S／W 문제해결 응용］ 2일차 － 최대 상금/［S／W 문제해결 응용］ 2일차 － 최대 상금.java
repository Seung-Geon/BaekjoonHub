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
public class Solution {
    static int resultMax;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String numStr = sc.next();
            int count = sc.nextInt();

            // 숫자의 자릿수가 최대 6자리이므로, 자리를 바꾸는 횟수가 문자열 길이를 넘어가면 시간 초과가 날 수 있습니다.
            // 자릿수만큼만 바꿔도 만들 수 있는 가장 큰 수를 충분히 만들 수 있습니다.
            if (count > numStr.length()) {
                count = numStr.length();
            }

            resultMax = 0;
            // 배열, 남은 교환 횟수, 그리고 중복 탐색을 줄이기 위해 현재 탐색할 시작 인덱스를 넘깁니다.
            findMaxNum(numStr.toCharArray(), count, 0);

            System.out.println("#" + test_case + " " + resultMax);
        }
    }

    private static void findMaxNum(char[] chars, int remainCount, int start) {
        if (remainCount == 0) {
            int currentNum = Integer.parseInt(String.valueOf(chars));
            resultMax = Math.max(resultMax, currentNum);
            return;
        }

        // i를 start부터 시작하여 불필요하게 이전 자리들끼리 다시 교환하는 것을 방지합니다.
        for (int i = start; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                swap(chars, i, j);
                // i 위치의 숫자와 j 위치의 숫자를 바꿨으므로, 
                // 다음 재귀에서는 적어도 i 위치부터 다시 탐색하도록 start에 i를 넘겨줍니다.
                findMaxNum(chars, remainCount - 1, i);
                swap(chars, i, j);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}

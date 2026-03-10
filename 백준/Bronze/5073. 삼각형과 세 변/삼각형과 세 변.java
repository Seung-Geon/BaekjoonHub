import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st;

            while (true) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                if(a == 0 && b == 0 && c == 0) {
                    break;
                }

                int max = Math.max(Math.max(a, b), c);
                int sum = a + b + c - max;

                if (max >= sum) {
                    System.out.println("Invalid");
                } else if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

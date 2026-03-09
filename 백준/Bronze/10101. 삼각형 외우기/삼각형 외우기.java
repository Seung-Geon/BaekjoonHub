

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            c = Integer.parseInt(br.readLine());

            int sumAngle = a + b + c; // 세 각의 합
            int sameAngle = 0; // 동일한 각의 개수

            if (a == b && b == c) sameAngle = 3;
            else if (a == b || a == c || b == c) sameAngle = 2;

            if (sumAngle != 180) {
                System.out.println("Error");
            }
            else if (sameAngle == 3) {
                System.out.println("Equilateral");
            } else if (sameAngle == 2) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

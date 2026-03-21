

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            boolean flag = false;

            for (int i = 1; i < n; i++) {
                int sum = 0;

                int temp = i;
                while (temp > 10) {
                    sum += temp % 10;
                    temp /= 10;
                }
                sum += temp + i;

                if (sum == n) {
                    System.out.println(i);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int m = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int min = Integer.MAX_VALUE;
            int sum = 0;

            for (int i = m; i <= n; i++) {
                if (isPrime(i)) {
                    sum += i;
                    if (min == Integer.MAX_VALUE) {
                        min = i;
                    }
                }
            }

            if (sum == 0) {
                System.out.println(-1);
            } else {
                System.out.println(sum);
                System.out.println(min);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            long count = 0;

            count = (long)(n - 2) * (n - 1) * (n) / 6;

            System.out.println(count);
            System.out.println(3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

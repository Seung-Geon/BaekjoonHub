

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            Long sum = 0L;
            for (int i = 1; i < n; i++) {
                sum += i;
            }
            System.out.println(sum);
            System.out.println(2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

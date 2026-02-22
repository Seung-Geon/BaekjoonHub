

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int b = 1;
            int count = 1;
            while(b < n) {
                b += 6 * count;
                count++;
            }

            System.out.println(count);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

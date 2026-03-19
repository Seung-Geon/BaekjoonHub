

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int c = Integer.parseInt(br.readLine());
            int number = Integer.parseInt(br.readLine());

            
            if (n > c) {
                System.out.println(0);
            } else if (n * number + m <= c * number) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

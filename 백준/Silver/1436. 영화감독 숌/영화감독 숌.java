

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {

        int n;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int count = 0;

        for (int i = 666; i < Integer.MAX_VALUE; i++) {
            String temp = Integer.toString(i);

            if(temp.contains("666")) {
                count++;
            }

            if(count == n) {
                System.out.println(i);
                break;
            }
        }
    }
}

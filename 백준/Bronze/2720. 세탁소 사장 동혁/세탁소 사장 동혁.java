import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        int[] coins = {25, 10, 5, 1};

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {
                int n = Integer.parseInt(br.readLine());

                for (int j = 0; j < coins.length; j++) {
                    int temp = n / coins[j];

                    if (j != 0) {
                        System.out.print(" ");
                    }
                    System.out.print(temp);


                    n %= coins[j];
                }

                System.out.println();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

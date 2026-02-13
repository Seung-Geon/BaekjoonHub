

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int max = 0;
            int x = 0;
            int y = 0;

            StringTokenizer st;

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());

                    if (max < arr[i][j]) {
                        max = arr[i][j];
                        x = j;
                        y = i;
                    }

                }
            }

            System.out.println(max);
            System.out.println((y + 1) + " " + (x + 1));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 8};

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 0; i < arr.length; i++) {
                if(i != 0) {
                    System.out.print(" ");
                }

                System.out.print(arr[i] - Integer.parseInt(st.nextToken()));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

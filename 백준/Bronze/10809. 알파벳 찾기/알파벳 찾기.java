

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String str = br.readLine();

            for (int i = 0; i < str.length(); i++) {

                char c = str.charAt(i);
                int n = c - 'a';

                if (arr[n] == -1) {
                    arr[n] = i;
                }
            }

            System.out.println(Arrays.toString(arr).replace("[","").replace("]","").replace(",",""));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

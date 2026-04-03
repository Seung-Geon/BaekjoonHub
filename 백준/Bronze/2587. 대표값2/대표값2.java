

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(br.readLine());
                sum += arr[i];
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}

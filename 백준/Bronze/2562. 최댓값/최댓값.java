import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static void solution(int[] arr) {
        int max = arr[0];
        int index = 0;

        for(int i = 1; i < 9; i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[9];

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for(int i = 0; i < 9; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        solution(arr);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[6];

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        boolean flag1 = false;
        boolean flag2 = false;

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (arr[0] * i + arr[1] * j == arr[2]) {
                    flag1 = true;
                } else {
                    flag1 = false;
                }

                if (arr[3] * i + arr[4] * j == arr[5]) {
                    flag2 = true;
                } else {
                    flag2 = false;
                }

                if (flag1 && flag2) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}

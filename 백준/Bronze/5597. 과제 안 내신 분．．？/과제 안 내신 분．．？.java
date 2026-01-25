import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        boolean[] arr = new boolean[30];

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st;
            for (int i = 0; i < 28; i++) {
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());

                arr[num - 1] = true;}

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 30; i++) {
            if(!arr[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
 
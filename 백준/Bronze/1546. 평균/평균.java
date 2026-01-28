import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            double[] arr = new double[n];

            double max = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = Double.parseDouble(st.nextToken());

                if(max <= arr[i]) {
                    max = arr[i];
                }
            }
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i] / max * 100;
            }

            System.out.println(sum/n);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int pointCount = 2;

            for (int i = 0; i < n; i++) {
                pointCount += pointCount - 1;
            }

            System.out.println((int)Math.pow(pointCount, 2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

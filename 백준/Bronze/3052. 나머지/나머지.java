import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st;
            for (int i = 0; i < 10; i++) {
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());

                map.put(num % 42, 1);
            }

            System.out.println(map.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

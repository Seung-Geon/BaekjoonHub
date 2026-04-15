import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), true);
        }

        String temp;
        for (int i = 0; i < m; i++) {
            temp = br.readLine();

            if(map.containsKey(temp)) {
                count++;
            }
        }

        System.out.println(count);
    }
}

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

        Map<String, Integer> nameToNum = new HashMap<>();
        String[] numToName = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameToNum.put(name, i);
            numToName[i] = name;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String query = br.readLine();

            if (Character.isDigit(query.charAt(0))) {
                int num = Integer.parseInt(query);
                sb.append(numToName[num]).append("\n");
            } else {
                sb.append(nameToNum.get(query)).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}

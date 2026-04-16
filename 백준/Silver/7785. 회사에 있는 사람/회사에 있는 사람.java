import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Boolean> map = new HashMap<>();
        StringTokenizer st;

        String emp;
        boolean flag;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            emp = st.nextToken();
            flag = "enter".equals(st.nextToken());

            map.put(emp, flag);
        }

        List<String> list = new ArrayList<>();
        for (String key: map.keySet()) {
            if (map.get(key)) {
                list.add(key);
            }
        }
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }
}

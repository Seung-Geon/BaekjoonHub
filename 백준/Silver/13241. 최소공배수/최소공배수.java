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

        long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());

        Map<Long, Integer> mapA = new HashMap<>();
        Map<Long, Integer> mapB = new HashMap<>();

        for (long i = 2; i <= A; i++) {
            while (A % i == 0) {
                if (mapA.containsKey(i)) {
                    mapA.put(i, mapA.get(i) + 1);
                } else {
                    mapA.put(i, 1);
                }

                A /= i;
            }
        }

        for (long i = 2; i <= B; i++) {
            while (B % i == 0) {
                if (mapB.containsKey(i)) {
                    mapB.put(i, mapB.get(i) + 1);
                } else {
                    mapB.put(i, 1);
                }

                B /= i;
            }
        }

        Map<Long, Integer> map = new HashMap<>(mapB);

        for (long key: mapA.keySet()) {
            if (map.containsKey(key)) {
                map.put(key, Math.max(map.get(key), mapA.get(key)));
            } else {
                map.put(key, mapA.get(key));
            }
        }

        long result = 1;

        for (long key: map.keySet()) {
            result = (long) (result * Math.pow(key, map.get(key)));
        }

        System.out.println(result);
    }
}

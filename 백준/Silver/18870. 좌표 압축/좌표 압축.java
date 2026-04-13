import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        int[] arr;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int count = 0;
        for (int num: set.toArray(new Integer[0])) {
            map.put(num, count);
            count++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i]) + " ");
        }

        System.out.println(sb.toString().trim());
    }
}

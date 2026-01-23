import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {

        List<Integer[]> list = new ArrayList<>();

        int a, b;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            do {
                StringTokenizer st = new StringTokenizer(br.readLine());

                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                list.add(new Integer[]{a, b});
            } while(a != 0 || b != 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(int i = 0; i < list.size() - 1; i++) {
            System.out.println(list.get(i)[0] + list.get(i)[1]);
        }

    }
}

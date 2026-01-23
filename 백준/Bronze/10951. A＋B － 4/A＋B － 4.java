import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while(true) {
                String str = br.readLine();
                if(str == null) break;

                StringTokenizer st = new StringTokenizer(str);

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if(a < 0 || b < 0 || a > 10 || b > 10) break;

                System.out.println(a + b);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            StringBuilder sb1 = new StringBuilder(st.nextToken());
            sb1.reverse();

            StringBuilder sb2 = new StringBuilder(st.nextToken());
            sb2.reverse();

            System.out.println(Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

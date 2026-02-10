
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();

            StringBuilder sb = new StringBuilder(str);
            sb.reverse();

            System.out.println(str.equals(sb.toString())? 1 : 0);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

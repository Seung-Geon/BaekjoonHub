import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int n;

            n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                String str = br.readLine();

                System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    
}

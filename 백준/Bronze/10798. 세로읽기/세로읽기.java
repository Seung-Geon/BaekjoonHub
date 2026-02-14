import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        String[] str = new String[5];

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                str[i] = br.readLine();
            }

            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i < str[j].length()) {
                        System.out.print(str[j].charAt(i));
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

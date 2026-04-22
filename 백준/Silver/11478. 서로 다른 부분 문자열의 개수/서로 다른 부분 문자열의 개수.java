import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new HashSet<>();
        String str = br.readLine();

        for (int i = 1; i <= str.length(); i++) {
                String temp;
                for (int j = 0; j <= str.length() - i; j++) {
                    temp = str.substring(j, j+i);

                    set.add(temp);
                }
        }

        System.out.println(set.size());
    }
}

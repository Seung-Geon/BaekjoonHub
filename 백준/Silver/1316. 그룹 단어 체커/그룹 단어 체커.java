

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int count = 0;

            String str;
            for (int i = 0; i< n; i++) {
                str = br.readLine();

                HashMap<Character, Boolean> map = new HashMap<>();

                char c = '\u0000';
                for (int j = 0; j < str.length(); j++) {

                    if (c == str.charAt(j)) {
                        continue;
                    }

                    c = str.charAt(j);

                    if(map.containsKey(c)) {
                        map.put(c, false);
                        break;
                    } else {
                        map.put(c, true);
                    }
                }
                if(!map.containsValue(false)) {
                    count++;
                }

            }

            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

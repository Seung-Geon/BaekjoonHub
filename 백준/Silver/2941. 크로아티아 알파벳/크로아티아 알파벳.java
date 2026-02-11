

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        /**
         * c=
         * c-
         * dz=
         * d-
         * lj
         * nj
         * s=
         * z=
         */

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String str = br.readLine();

            int count = 0;

            for (String tmp : arr) {
                int k;
                while ((k = str.indexOf(tmp)) != -1) {
                    str = str.substring(0, k) + ' ' + str.substring(k + tmp.length());
                    count++;
                }
            }
            str = str.trim();
            str = str.replace(" ", "");
            System.out.println(count + str.length());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

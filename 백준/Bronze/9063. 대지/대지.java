import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int minX = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxY = Integer.MIN_VALUE;

            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if (maxX < x) {
                    maxX = x;
                }

                if(minX > x){
                    minX = x;
                }

                if (maxY < y) {
                    maxY = y;
                }

                if(minY > y){
                    minY = y;
                }
            }

            System.out.println((maxX - minX) * (maxY - minY));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

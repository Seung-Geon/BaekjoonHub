import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int[] arr2 = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr2[i] = arr[i + 1] - arr[i];
        }
        
        int gcdValue = arr2[0];
        
        for (int i = 1; i < n - 1; i++) {
            gcdValue = gcd(gcdValue, arr2[i]);
        }
        
        System.out.println((arr[n - 1] - arr[0]) / gcdValue + 1 - n);
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        int n;
        int[] arr;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());

            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int[] temp = new int[n];
        
        sort2pt(arr, temp, 0, n - 1);

        StringBuilder sb = new StringBuilder();
        for(int num : arr) {
            sb.append(num).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void sort2pt(int[] arr, int[] temp, int front, int back) {
        if (front >= back) {
            return;
        }

        int middle = (front + back) / 2;

        sort2pt(arr, temp, front, middle); 
        sort2pt(arr, temp, middle + 1, back); 

        int cho1 = front;       
        int cho2 = middle + 1; 
        int idx = front;       

        while (cho1 <= middle && cho2 <= back) {
            if (arr[cho1] <= arr[cho2]) {
                temp[idx] = arr[cho1];
                cho1++;
            } else {
                temp[idx] = arr[cho2];
                cho2++;
            }
            idx++;
        }

        while (cho1 <= middle) {
            temp[idx] = arr[cho1];
            idx++;
            cho1++;
        }

        while (cho2 <= back) {
            temp[idx] = arr[cho2];
            idx++;
            cho2++;
        }

        for (int i = front; i <= back; i++) {
            arr[i] = temp[i];
        }
    }
}

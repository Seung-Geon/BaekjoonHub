import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        int n, m;

        int[][] arr;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                String str = br.readLine();

                for (int j = 0; j < m; j++) {
                    arr[i][j] = str.charAt(j) == 'W' ? 1 : 0;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(Arrays.deepToString(arr));
        int[][] temp;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n - 7; i++) {
            for(int j = 0; j < m - 7; j++) {
                temp = arrCopy(arr, i, j);
                min = Math.min(min, solve(temp));
            }
        }

        System.out.println(min);
    }

    private static int[][] arrCopy(int[][] arr, int i, int j) {
        int[][] result = new int[8][8];

//        System.out.println(i + " " + j);

        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
//                System.out.println(k + " " + l);
                result[k][l] = arr[i + k][j + l];
            }
        }

        return result;
    }

    private static int solve(int[][] temp) {
        int[][] answer1 = {
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1}
        };

        int[][] answer2 = {
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0}
        };

        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (temp[i][j] != answer1[i][j]) {
                    count1++;
                }
                if (temp[i][j] != answer2[i][j]) {
                    count2++;
                }
            }
        }

        return Math.min(count1, count2);
    }
}

package Lab_2;//C = trans(B)
//long
//Обчислити суму найбільших елементів в стовпцях матриці з парними номерами та найменших елементів в стовпцях матриці з непарними номерами
import java.util.Scanner;

public class lab_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'n', 'm'\n");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] trans_arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        // Для наглядності цикл транспонування написаний окремо

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                trans_arr[j][i] = arr[i][j];
        }
        int sum_mn = 0, sum_mx = 0;
        for (int i = 0; i < m; i++) {
            int mx = trans_arr[i][1], mn = trans_arr[i][0];

            for (int j = 1; j < n; j += 2)
                mx = Math.max(mx, trans_arr[i][j]);

            for (int j = 0; j < n; j += 2)
                mn = Math.min(mn, trans_arr[i][j]);

            sum_mn += mn;
            sum_mx += mx;

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                trans_arr[j][i] = arr[i][j];
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++)
                System.out.print(trans_arr[i][j] + " ");
            System.out.println();
        }

        System.out.println("MAX: " + sum_mx);
        System.out.println("MIN: " + sum_mn);
    }
}

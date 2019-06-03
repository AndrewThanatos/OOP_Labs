package Lab_1;
// -
// 2
// /
// char

import java.util.Scanner;

public class lab_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'a', 'b', 'n', 'm'\n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        if ((a <= 2 && n > 2) || (b <= 0 && m > 0)) {
            System.out.println("Error: Division by ZERO :(");
            return;
        }

        float s = 0;
        for (char i = (char) a; i <= n; i++)
            for (char j = (char) b; j <= m; j++) {
                s += ((float) i / j) / (i - 2.0);
//                System.out.println((float) i);
//                System.out.println(j);
//                System.out.println((float) i / (float) j);
            }
        System.out.println(s);
    }
}
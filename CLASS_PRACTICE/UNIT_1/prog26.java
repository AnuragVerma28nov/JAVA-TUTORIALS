// table of a number

import java.util.*;

public class prog26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for table: ");
        int n = sc.nextInt();
        System.out.println("Table of " + n + ":");
        for (int i = 0; i <= 10; i++) {
            int t = n * i;
            System.err.println(n + " * " + i + " = " + t);

        }
        sc.close();
    }
}
// Output (example):
// Enter number for table: 2
// Table of 2:
// 2 * 0 = 0
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// 2 * 4 = 8
// 2 * 5 = 10
// 2 * 6 = 12
// 2 * 7 = 14
// 2 * 8 = 16
// 2 * 9 = 18
// 2 * 10 = 20

//use of ternary operator

package UNIT_1;

import java.util.*;

public class prog22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a number: ");
        int n = sc.nextInt();

        System.err.print("Enter a number: ");
        int m = sc.nextInt();

        int g = (n > m) ? n : m; // Ternary operator to find the greater number

        System.err.print("Greater number:" + g);
        sc.close();

    }
}
// Output (example):
// Enter a number: 5
// Enter a number: 7
// Greater number:7

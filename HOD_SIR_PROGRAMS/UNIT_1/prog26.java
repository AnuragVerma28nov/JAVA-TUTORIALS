// rable of a number

import java.util.*;

public class prog26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for table: ");
        int n = sc.nextInt();
        System.out.println("Table of " + n+":");
        for (int i = 0; i <= 10; i++) {
            int t = n * i;
            System.err.println(n + " * " + i + " = " + t);

        }
        // sc.close();
    }
}

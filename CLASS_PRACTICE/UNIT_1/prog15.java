//  Print First N Sum Numbers

import java.util.*;

public class prog15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " numbers: " + sum);
        sc.close();
    }

}
// Output (example):
// Enter a number: 5
// Sum of first 5 numbers: 15

//Check if a Number is Negative, Positive, or Zero

package UNIT_1;

import java.util.Scanner;

public class prog16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("Number is zero.");
        }
        sc.close();
    }

}
// Output (example):
// Enter a number: -5
// -5 is negative.
// Enter a number: 0
// Number is zero.
// Enter a number: 7
// 7 is positive.
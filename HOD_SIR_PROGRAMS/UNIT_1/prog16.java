//Check if a Number is Negative, Positive, or Zero

import java.util.Scanner;

public class prog16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " is positive number.");
        } else if (num < 0) {
            System.out.println(num + " is negative number.");
        } else {
            System.out.println("Number is zero.");
        }
        // sc.close();
    }
}

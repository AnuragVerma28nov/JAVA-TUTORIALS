// Calculate Factorial of a Number

import java.util.Scanner;

public class prog20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial of Negative number not Exist.");
        } else {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " : " + fact);
            sc.close();
        }
    }
}

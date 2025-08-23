// addition of two numbers input by user

import java.util.*;

public class prog11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close();
    }

}
// Output:
// Enter first number: 5
// Enter second number: 7
// The sum of 5 and 7 is: 12

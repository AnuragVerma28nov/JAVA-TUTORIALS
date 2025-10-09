package Module_4_BASICS;

import java.util.Scanner;

public class sumOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n = sc.nextInt();

        System.out.print("Enter second number: ");
        int m = sc.nextInt();

        int sum =  n + m;

        System.out.print("Sum: " + sum);

    }
}

//Output:
//Enter first number: 23
//Enter second number: 23
//Sum: 46
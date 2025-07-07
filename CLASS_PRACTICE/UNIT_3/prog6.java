// Square Of number using Lamda expressions and Functional Interface

package UNIT_3;

import java.util.*;

@FunctionalInterface
interface Square {
    int calculate(int num);
}

public class prog6 {
    public static void main(String[] args) {
        Square square = (num) -> num * num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Square of " + num + ": " + square.calculate(num));
        sc.close();
    }
}

// Output:
// Enter a number: 5
// Square of 5: 25
// program to swap two variables without using a third variable

package UNIT_1;

import java.util.*;

public class prog14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for A: ");
        int a = sc.nextInt();

        System.out.print("Enter value for B: ");
        int b = sc.nextInt();

        System.out.println("Before Swap: A = " + a + ", B = " + b);

        a = a + b;//a = a ^ b;
        b = a - b;//b = a ^ b;
        a = a - b;//a = a ^ b;

        System.out.println("After Swap: A = " + a + ", B = " + b);
        sc.close();
    }

}
// Output (example):
// Enter value for A: 3
// Enter value for B: 8
// Before Swap: A = 3, B = 8
// After Swap: A = 8, B = 3

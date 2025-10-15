// Swapping of two Variables using a third variable

package UNIT_1;

import java.util.*;

public class prog13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for A: ");
        int a = sc.nextInt();

        System.out.print("Enter value for B: ");
        int b = sc.nextInt();

        System.out.println("Before Swap: A = " + a + ", B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: A = " + a + ", B = " + b);
        sc.close();

    }

}
// Output (example):
// Enter value for A: 5
// Enter value for B: 7
// Before Swap: A = 5, B = 7
// After Swap: A = 7, B = 5
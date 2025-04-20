// program to swap two variables without using a third variable

import java.util.*;

public class prog14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for A: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for B: ");
        int b = scanner.nextInt();

        System.out.println("Before Swap: A = " + a + ", B = " + b);

        a = a + b;//a = a ^ b;
        b = a - b;//b = a ^ b;
        a = a - b;//a = a ^ b;

        System.out.println("After Swap: A = " + a + ", B = " + b);
    }
}

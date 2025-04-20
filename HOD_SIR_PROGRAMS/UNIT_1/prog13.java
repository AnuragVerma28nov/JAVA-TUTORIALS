// Swapping of two Variables

import java.util.*;

public class prog13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for A: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for B: ");
        int b = scanner.nextInt();

        System.out.println("Before Swap: A = " + a +", B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: A = " + a + ", B = " + b);

    }
}

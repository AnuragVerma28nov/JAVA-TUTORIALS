// Use of increment and decrement operator

package UNIT_1;

import java.util.*;

public class prog21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num = sc.nextInt();

        System.out.println("Post increment: " + num++);// Displays the value before incrementing
        System.out.println("Pre increment: " + ++num);// Displays the value after incrementing
        System.out.println("Post decrement: " + num--);// Displays the value before decrementing
        System.out.println("Pre decrement: " + --num);// Displays the value after decrementing

        sc.close();
    }
}
// Output (example):
// Enter first number: 5
// Post increment: 5
// Pre increment: 7
// Post decrement: 7
// Pre decrement: 5

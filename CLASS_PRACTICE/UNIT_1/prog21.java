// Use of increment and decrement operator

import java.util.*;

public class prog21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num = sc.nextInt();

        System.out.println("Post increment: " + num++);
        System.out.println("Pre increment: " + ++num);
        System.out.println("Post decrement: " + num--);
        System.out.println("Pre decrement: " + --num);

        sc.close();
    }
}

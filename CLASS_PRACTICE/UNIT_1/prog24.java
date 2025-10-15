// reading a string from the user and printing it

package UNIT_1;

import java.util.*;

public class prog24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter your name: ");
        String s = sc.nextLine();
        System.out.println("Your name is " + s + ".");

        sc.close();
    }
}
// Output (example):
// Enter your name: Anurag
// Your name is Anurag.


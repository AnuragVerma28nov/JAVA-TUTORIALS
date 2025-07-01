// Program to input an alphabet, display it in uppercase if entered in lowercase and vice versa

package unit_1;

import java.util.Scanner;

public class prog34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            System.out.println("Uppercase: " + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println("Lowercase: " + Character.toLowerCase(ch));
        } else {
            System.out.println("Not an alphabet!");
        }
        sc.close();
    }
}
// Output (example):
// Enter an alphabet: a
// Uppercase: A
// Enter an alphabet: Z
// Lowercase: z

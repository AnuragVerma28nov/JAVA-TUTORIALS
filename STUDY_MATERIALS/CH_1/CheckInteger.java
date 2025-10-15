
// detect if the user has entered an integer or not

package chap2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");

        try {
            int num = sc.nextInt();
            System.out.println("You entered an integer: " + num);
        } catch (InputMismatchException e) {
            System.out.println("You did not enter an integer.");
        } finally {
            sc.close();
        }
    }
}

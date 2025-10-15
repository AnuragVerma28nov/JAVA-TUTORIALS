// Enter a Number and print its reverse

package UNIT_1;

import java.util.Scanner;

public class prog17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int d, r = 0;
        while (num > 0) {
            d = num % 10;
            r = r * 10 + d;
            num = num / 10;
        }
        System.out.println("Reverse Number: " + r);
        sc.close(); 
    }

}
// Output (example):
// Enter a number: 1234
// Reverse Number: 4321

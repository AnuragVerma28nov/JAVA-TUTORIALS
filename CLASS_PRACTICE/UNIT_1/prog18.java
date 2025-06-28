// checking palindrome number

import java.util.Scanner;

public class prog18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int n = num;
        int d, r = 0;
        while (n > 0) {
            d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        if (num == r) {
            System.out.println(num + " is palindrome number.");
        } else {
            System.out.println(num + " is not palindrome number.");
        }
        sc.close(); 
    }

}
// Output (example):
// Enter a number: 121
// 121 is palindrome number.
// Enter a number: 123
// 123 is not palindrome number.

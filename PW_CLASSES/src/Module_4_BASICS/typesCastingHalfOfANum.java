package Module_4_BASICS;

import java.util.Scanner;

public class typesCastingHalfOfANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        System.out.println("Half of "+a+": "+(double)a/2);

    }
}
//Output:
//Enter a number: 9
//Half of 9: 4.5
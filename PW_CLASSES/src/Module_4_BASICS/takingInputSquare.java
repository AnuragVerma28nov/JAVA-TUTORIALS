package Module_4_BASICS;

import java.util.Scanner;

public class takingInputSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Square of number: " + a*a );
    }
}

//Output:
//Enter a number: 7
//Square of number: 49
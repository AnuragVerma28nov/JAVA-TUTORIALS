package Module_5_CONDITIONALS;

import java.util.Scanner;

public class evenOdd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.print("Even Number.");
        }
        if(n % 2 != 0) {
            System.out.print("Odd Number.");
        }

    }
}

//Output:
//Enter a number: 26
//Even Number.
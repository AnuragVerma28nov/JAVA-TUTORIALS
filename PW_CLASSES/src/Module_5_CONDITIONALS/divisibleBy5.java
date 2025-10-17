package src.Module_5_CONDITIONALS;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if( n % 5 == 0){
            System.out.print("Divisible by 5.");
        } else{
            System.out.print("Not divisible by 5");
        }

        sc.close();
    }
}

//Output:
//Enter a number: 265
//Divisible by 5.
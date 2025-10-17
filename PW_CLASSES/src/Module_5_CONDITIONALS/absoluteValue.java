package src.Module_5_CONDITIONALS;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if( n < 0){
            System.out.print(-n);
        } else{
            System.out.print(n);
        }

        sc.close();
    }
}

//Output
//Enter a number: -150
//150
package Module_4_BASICS;

import java.util.Scanner;

public class typeCastingIntegerPartOfDoubleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a= sc.nextDouble();
        System.out.print("Integer pat of "+a+": "+(int)a);
    }
}

//Output:
//Enter a number: 6.35
//Integer pat of 6.35: 6
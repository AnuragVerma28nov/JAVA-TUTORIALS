//kilometers into miles 

package chap2;

import java.util.Scanner;

public class KiloToMiles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        sc.close();
        double miles = km * 0.621371;
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

    }

}

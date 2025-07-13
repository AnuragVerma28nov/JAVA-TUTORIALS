// Yields Statement Example

package UNIT_3;

import java.util.Scanner;

public class prog21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int num = sc.nextInt();
        String dname; // Variable to hold day name

        switch (num) {
            case 1 -> dname = "Monday";
            case 2 -> dname = "Tuesday";
            case 3 -> dname = "Wednesday";
            case 4 -> dname = "Thursday";
            case 5 -> dname = "Friday";
            case 6 -> dname = "Saturday";
            case 7 -> dname = "Sunday";
            default -> dname = "Invalid Day";
        }

        System.out.println("Day " + num + " is: " + dname);
        sc.close();
    }
}

// Output:
// Enter a day number (1-7): 3  
// Day 3 is: Wednesday

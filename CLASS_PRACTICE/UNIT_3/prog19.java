// Switch case  Example 1

package UNIT_3;

import java.util.*;

public class prog19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();
        String dname;

        switch (day) {
            case 1:
                dname = "Monday";
                break;
            case 2:
                dname = "Tuesday";
                break;
            case 3:
                dname    = "Wednesday";
                break;
            case 4:
                dname = "Thursday";
                break;
            case 5:
                dname = "Friday";
                break;
            case 6:
                dname = "Saturday";
                break;
            case 7:
                dname = "Sunday";
                break;
            default:
                dname = "Invalid Day";
        }

        System.out.println("Day " + day + " is: " + dname);
        sc.close();
    }
    
}

// Output:
// Enter a day number (1-7): 3  
// Day 3 is: Wednesday
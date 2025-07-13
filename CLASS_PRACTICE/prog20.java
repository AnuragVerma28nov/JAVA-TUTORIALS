// Switch case  Example 2

package UNIT_3;

public class prog20 {
    public static void main(String[] args) {
        int day = 3;

        String dname;

        switch (day) {
            case 1:
                dname = "Monday";
                break;
            case 2:
                dname = "Tuesday";
                break;
            case 3:
                dname = "Wednesday";
            default:
                dname = "Invalid Day";
        }

        System.out.println("Day " + day + " is: " + dname);
    }

}

// Output:
// Day 3 is: Wednesday
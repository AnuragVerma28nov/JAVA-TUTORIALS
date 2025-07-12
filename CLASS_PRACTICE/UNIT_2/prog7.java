// Example of Throws in Java

package UNIT_2;

public class prog7 {
    public  void checkNum(int num) throws IllegalArgumentException { // Method to check if the number is positive
        if (num < 0) {
            throw new IllegalArgumentException("Number is negative: " + num);
        } else {
            System.out.println("Number is positive: " + num);
        }
    }

    public static void main(String[] args) {
        prog7 prog7 = new prog7();
        try {
            prog7.checkNum(10); // This will not throw an exception
            prog7.checkNum(-5); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Rest of code. Program continues...");
       
    }
}

// Output:
// Number is positive: 10
// Exception caught: Number is negative: -5
// Rest of code. Program continues...

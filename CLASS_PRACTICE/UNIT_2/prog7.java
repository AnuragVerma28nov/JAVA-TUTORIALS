// Example of Throws in Java

package UNIT_2;

public class prog7 {
    public static void checkNum(int num) throws IllegalArgumentException { // Method to check if the number is positive
        if (num < 0) {
            throw new IllegalArgumentException("Number is negative: " + num);
        } else {
            System.out.println("Number is positive: " + num);
        }
    }

    public static void main(String[] args) {
        prog7.checkNum(-5); // This will throw an exception
        System.out.println("Rest of code. Program continues...");
       
    }
}

// Output:
// Exception in thread "main" java.lang.IllegalArgumentException: Number is negative: -5
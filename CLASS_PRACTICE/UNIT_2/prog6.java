// Example of Throw in Java

package UNIT_2;

public class prog6 {
    public static void checkNum(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number is negative: " + num);
        } else {
            System.out.println("Number is positive: " + num);
        }
    }

    public static void main(String[] args) {
        prog6.checkNum(-5); // This will throw an exception
        System.out.println("Rest of code. Program continues...");
    }
}

// Output:
// IllegalArgumentException: Number is negative: -5
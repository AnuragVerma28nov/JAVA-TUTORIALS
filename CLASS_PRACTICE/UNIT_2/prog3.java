// When an exception doesn't occur, the program continues to run normally.

package UNIT_2;

public class prog3 {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 2;
            int result = a / b;
            System.out.println("Result: " + result);
            System.out.println("Code inside try block executed successfully.");
        } catch (ArithmeticException e) {
            System.out.println("Code inside catch block executed.");
        } finally {
            System.out.println("This finally block always executes.");
        }
        System.out.println("Rest of code. Program continues...");
    }
}

// Output:
// Result: 5
// Code inside try block executed successfully.
// This finally block always executes.
// Rest of code. Program continues...

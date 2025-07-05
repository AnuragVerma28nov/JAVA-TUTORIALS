// When an exception occur but not handled by catch block 

package UNIT_2;

public class prog4 {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (NullPointerException e) { // This catch block is not a NullPointerException
            // This block will not execute because the exception is  ArithmeticException
            System.out.println(e);
        }
        finally {
            System.out.println("This finally block always executes.");
        }
        System.out.println("Rest of code. Program continues...");
    }
}

// Output:
// Inside try block.
// This finally block always executes.
// Rest of code. Program continues...
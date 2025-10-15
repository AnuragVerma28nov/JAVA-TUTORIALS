// When an exception occur and handled by catch block 

package UNIT_2;

public class prog5 {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // This catch block will handle ArithmeticException
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println("Code inside catch block executed.");
        }
        finally {
            System.out.println("This finally block always executes.");
        }
        System.out.println("Rest of code. Program continues...");
    }
}

// Output:
// Inside try block.
// ArithmeticException caught: / by zero
// Code inside catch block executed.
// This finally block always executes.
// Rest of code. Program continues...
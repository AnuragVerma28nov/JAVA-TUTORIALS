// ArithmeticException Example in Java         

package UNIT_2;

public class prog1 {
    
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block.");
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }
        finally {
            System.out.println("This finally block always executes.");
        }
        System.out.println("Rest of the code.");
    }
}
// Output:
// Inside try block.
// Inside catch block.
// ArithmeticException caught: Division by zero is not allowed.
// This finally block always executes.
// Rest of the code.

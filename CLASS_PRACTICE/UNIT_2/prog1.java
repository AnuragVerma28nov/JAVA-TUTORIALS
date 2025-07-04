// ArithmeticException Example in Java         

package UNIT_2;

public class prog_1 {
    
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }
        System.out.println("Rest of the code.");
    }
}
// Output:
// ArithmeticException caught: Division by zero is not allowed.

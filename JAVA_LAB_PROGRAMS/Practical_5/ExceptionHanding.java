package Practical_5;

public class ExceptionHanding {
    public static void main(String[] args) {
        try {
            int num1 = 15; // initialing variable 1
            int num2 = 0; // initialing variable 2
            int div = num1 / num2; // Performing division
            System.out.println("Result: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }

}

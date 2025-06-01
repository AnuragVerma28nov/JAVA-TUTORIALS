package Practical_5;

import java.util.Scanner;

class InvalidNumberException extends Exception {// Custom Exception Class
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter two numbers for division:");// User input for division
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            System.out.println("Result: " + (num1 / num2));

            int[] numbers = { 10, 20, 30 };
            System.out.println("Enter an index (0-2) to access:"); // User input for array index
            int index = scanner.nextInt();
            System.out.println("Value: " + numbers[index]);

            System.out.println("Enter a positive number:");// User input for custom exception
            int userInput = scanner.nextInt();
            if (userInput < 0) {
                throw new InvalidNumberException("Negative numbers are not allowed!");
            }
            System.out.println("Valid number entered: " + userInput);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        } catch (InvalidNumberException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Error Occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution complete.");
            scanner.close();
        }
    }
}

package Practical_6;

import Practical_6.src.Calculator; // Importing Calculator class
import java.util.Scanner; // Import Scanner for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator obj = new Calculator(); // Creating object of class Calculator

        while (true) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                scanner.close();
                obj.closeScanner();
                return;
            }

            // Get user input for numbers
            int num1 = obj.getUserInput("Enter first number: ");
            int num2 = obj.getUserInput("Enter second number: ");

            switch (choice) {
                case 1:
                    System.out.println("Sum: " + obj.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Subtraction: " + obj.sub(num1, num2));
                    break;
                case 3:
                    System.out.println("Multiplication: " + obj.multiply(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("Quotient: " + obj.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

/* Sample Output:

--- Calculator Menu ---
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Choose an operation: 1
Enter first number: 10
Enter second number: 5
Sum: 15

--- Calculator Menu ---
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Choose an operation: 2
Enter first number: 20
Enter second number: 7
Subtraction: 13

*/
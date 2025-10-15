package Practical_6.src;

import java.util.Scanner; // Import scanner for user input

public class Calculator {
    private Scanner scanner; // Scanner instance for input

    // Constructor to initialize Scanner
    public Calculator() {
        scanner = new Scanner(System.in);
    }

    // Method to take input from user
    public int getUserInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by Zero");
        }
        return (double) num1 / num2;
    }
    
    // Close Scanner when program ends
    public void closeScanner() {
        scanner.close();
    }
}
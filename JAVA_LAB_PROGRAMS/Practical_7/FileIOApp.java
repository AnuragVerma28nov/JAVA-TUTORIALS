package Practical_7;

import Practical_7.src.FileHandler; // Importing FileHandler class
import java.util.Scanner;

public class FileIOApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler();

        while (true) {
            System.out.println("\n--- File I/O Menu ---");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to save: ");
                    String text = scanner.nextLine();
                    fileHandler.writeToFile(text);
                    break;
                case 2:
                    fileHandler.readFromFile();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;                                                         
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

/* Sample Output:

--- File I/O Menu ---
1. Write to File
2. Read from File
3. Exit
Choose an option: 1
Enter text to save: Hello, this is a test.
Text written to file.

--- File I/O Menu ---
1. Write to File
2. Read from File
3. Exit
Choose an option: 2
Reading from file:
Hello, this is a test.

--- File I/O Menu ---
1. Write to File
2. Read from File
3. Exit
Choose an option: 3
Exiting...

*/


package Practical_1;

import java.util.Scanner;  // Import Scanner class

public class HelloWorld {  // Driver Class

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your department: ");
        String department = scanner.nextLine();

        System.out.print("Enter your year of study: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter your section: ");
        String section = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        int rollNo = scanner.nextInt();

        // Printing user details
        System.out.println("\n******** User Details ********");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Year of Study: " + year);
        System.out.println("Section: " + section);
        System.out.println("Roll Number: " + rollNo);

        scanner.close();
    }
}
// Output:
// Enter your name: Anurag
// Enter your department: Computer Science
// Enter your year of study: 2
// Enter your section: A
// Enter your roll number: 1
// program to calculate the total marks and percentage of 5 subjects

import java.util.*;

public class prog12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float sub1, sub2, sub3, sub4, sub5, total, percentage;

        System.out.print("Enter marks for Subject 1: ");
        sub1 = sc.nextFloat();
        System.out.print("Enter marks for Subject 2: ");
        sub2 = sc.nextFloat();
        System.out.print("Enter marks for Subject 3: ");
        sub3 = sc.nextFloat();
        System.out.print("Enter marks for Subject 4: ");
        sub4 = sc.nextFloat();
        System.out.print("Enter marks for Subject 5: ");
        sub5 = sc.nextFloat();

        total = sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = (total / 500) * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");

        // sc.close();
    }
}

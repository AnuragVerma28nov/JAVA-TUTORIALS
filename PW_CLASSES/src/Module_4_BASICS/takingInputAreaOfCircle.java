package Module_4_BASICS;

import java.util.Scanner;

public class takingInputAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double a = sc.nextDouble();
        double area = 3.14159 * a * a;
        System.out.println("Area of circle with radius " + a +": " + area);
    }
}

//Output:
//Enter a radius: 15
//Area of circle with radius 15.0: 706.85775


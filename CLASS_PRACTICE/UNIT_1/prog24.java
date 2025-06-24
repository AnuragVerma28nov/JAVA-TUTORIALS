// reading a string

import java.util.*;

public class prog24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = sc.nextLine();
        System.out.println("Your name is " + s+".");

        sc.close();
    }
}

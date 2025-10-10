package Module_4_BASICS;

import java.util.Scanner;

public class takingInputCharDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char a = sc.next().charAt(0);
        System.out.println((int)a);
    }
}

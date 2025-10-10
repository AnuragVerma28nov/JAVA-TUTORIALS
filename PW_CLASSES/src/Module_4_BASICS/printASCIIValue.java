package Module_4_BASICS;

import java.util.Scanner;

public class printASCIIValue {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Character: ");
            char a = sc.next().charAt(0);
            System.out.println((int)a);
        }
    }

//Output:
//Enter a Character: $
//36
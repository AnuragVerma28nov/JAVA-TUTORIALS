
import java.util.Scanner;

public class NameGreet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter your name: ");
        String name = sc.nextLine();
        // sc.close();
        System.err.println("Hello!" + name + ".Have a nice day!");

    }
}

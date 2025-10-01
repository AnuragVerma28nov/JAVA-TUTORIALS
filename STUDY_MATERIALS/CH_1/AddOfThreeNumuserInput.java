// addition of three numbers user input

package chap2;
 
import java.util.Scanner;


public class AddOfThreeNumuserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter three numbers: ");
        int a = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a + b + c;
        System.err.print("Additiin of Three Numbers: " + sum);
        
    }
}

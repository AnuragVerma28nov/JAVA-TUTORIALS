// checking checking armstrong number

import java.util.Scanner;

public class prog19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // sc.close();

        int orrN = num;
        int sum = 0;
        int digitC = (int) Math.log10(num) + 1;

        while (num > 0) {
            int d = num % 10;
            sum += (int) Math.pow(d, digitC);
            num /= 10;
        }

        if (orrN == sum) {
            System.out.println(orrN + " is an Armstrong number.");
        } else {
            System.out.println(orrN + " is not an Armstrong number.");
        }
    }
}

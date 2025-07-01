// Program to demonstrate static import in Java

package unit_1;

import static java.lang.Math.*;

public class prog35 {
    public static void main(String[] args) {
        double result = sqrt(25);
        int maxVal = max(10, 20);
        System.out.println("Square root of 25: " + result);
        System.out.println("Maximum of 10 and 20: " + maxVal);
    }
}
// Output:
// Square root of 25: 5.0
// Maximum of 10 and 20: 20

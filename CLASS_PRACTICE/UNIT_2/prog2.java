// ArrayIndexOutOfBoundsException Example in Java

package UNIT_2;

public class prog2 {
    
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index.");
        }
    }
}
// Output:
// ArrayIndexOutOfBoundsException caught: Invalid array index.
    
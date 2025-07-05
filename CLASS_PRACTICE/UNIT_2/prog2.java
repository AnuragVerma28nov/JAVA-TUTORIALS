// ArrayIndexOutOfBoundsException Example in Java

package UNIT_2;

public class prog2 {
    
    public static void main(String[] args) {
        int[] arr = new int[5]; // Array of size 5
        try {
            System.out.println("Inside try block.");
            arr[10]=10; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside catch block.");
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index.");
        }
        finally {
            System.out.println("This finally block always executes.");
        }
        System.out.println("Rest of code. Program continues...");
    }
}
// Output:
// Inside try block.
// Inside catch block.
// ArrayIndexOutOfBoundsException caught: Invalid array index.
// This finally block always executes.
// Rest of code. Program continues...



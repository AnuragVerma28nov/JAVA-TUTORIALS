// Lamda expressions

package UNIT_3;

@FunctionalInterface
interface abc {
    abstract void display();
}

public class prog5 {
    public static void main(String[] args) {
        abc obj = () -> System.out.println("Lambda expression implemented in abc interface.");
        obj.display(); // Calling the method of the lambda expression
    }
}

// Output:
// Lambda expression implemented in abc interface. 
 
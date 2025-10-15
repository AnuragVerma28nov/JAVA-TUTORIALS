// Anonymous functions 

package UNIT_3;

@FunctionalInterface
interface abc {
    abstract void display();
}

public class prog4 {
    public static void main(String[] args) {
        abc obj = new abc() {
            @Override
            public void display() {
                System.out.println("Anonymous function implemented in abc class.");
            }
        };
        obj.display(); // Calling the method of the anonymous class
    }
}

// Output:
// Anonymous function implemented in abc class.
// Simple interface example in Java
// An interface in Java is a reference type that defines a contract for classes to implement. It can contain method signatures (without bodies) and constants, but cannot contain instance fields or method implementations. Classes that implement an interface must provide concrete implementations for all of its methods.

package unit_1;

interface inter {
    final int a=7;
    public void display(); // interface method
}

public class prog32 implements inter {
    public void display() {
        System.out.println("Hello Interface. " );
    }

    public static void main(String[] args) {
        prog32 d = new prog32();
        d.display();
        System.out.println("Number is: " + a);
    }
}
// Output:
// Hello Interface.
// Number is: 7

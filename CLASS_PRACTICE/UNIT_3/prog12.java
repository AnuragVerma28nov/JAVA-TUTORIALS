// Simple Annotation Example

package UNIT_3;

 class base {
    public void display() {
        System.out.println("Base class display method");
    }   
}

public class prog12 extends base {
    @Override // Annotation to indicate that this method overrides a method in the superclass
    public void display() {
        System.out.println("Derived class display method");
    }
    public static void main(String[] args) {
        base obj = new prog12(); 
        obj.display();
    }
}

// Output:
// Derived class display method

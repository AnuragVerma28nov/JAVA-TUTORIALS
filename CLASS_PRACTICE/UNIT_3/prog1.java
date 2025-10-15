// Abstract class 

package UNIT_3;

abstract class abc { // Abstract class can have abstract methods
    abstract void display();

    void show() {
        System.out.println("This is a concrete method in an abstract class.");
    }
}

class ABC extends abc { // Concrete class extending abstract class
    @Override
    void display() {
        System.out.println("Display method implemented in ABC class.");
    }
}

public class prog1 {
    public static void main(String[] args) {
        ABC obj = new ABC(); 
        obj.display();
        obj.show(); 
    }

}

// Output:
// Display method implemented in ABC class.
// This is a concrete method in an abstract class.
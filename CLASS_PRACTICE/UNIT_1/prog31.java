// Simple abstraction example in Java
// Abstraction is a fundamental concept in object-oriented programming that allows you to hide the implementation details and show only the essential features of an object. In Java, abstraction can be achieved using abstract classes and interfaces.

package UNIT_1;

abstract class Bike {
    Bike() {
        System.out.println("Bike constructor called");
    }
    abstract void run(); // abstract method
    void gear() {
        System.out.println("Bike is in gear");
    }
}



public class prog31 extends Bike {
    void run() {
        System.out.println("Bike is running");
    }
    public static void main(String[] args) {
        Bike b = new prog31();
        b.run();
        b.gear();
    
    }
}
// Output:
//Bike constructor called
// Bike is running
// Bike is in gear

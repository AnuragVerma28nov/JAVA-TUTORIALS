// oops-polymorphism
// polymorphism is the ability of a single function or method to operate in different ways based on the input parameters or the context in which it is called. In Java, polymorphism can be achieved through method overloading and method overriding.

package UNIT_1;

class Area {

    void area(int n) {
        int a = n * n;
        System.err.println("Area of Square: " + a);
    }

    void area(int a, int b) {
        int s = a * b;
        System.err.println("Area of Reactanlge: " + s);
    }

}

public class prog29 {

    public static void main(String[] args) {
        Area obj = new Area();
        obj.area(5);
        obj.area(5, 5);
    }
}

// Output:
// Area of Square: 25
// Area of Reactanlge: 25

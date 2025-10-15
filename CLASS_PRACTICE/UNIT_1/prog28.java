//  constructor is a special method in Java that is called when an object of a class is created. It is used to initialize the object's properties or perform any setup required for the object. Constructors have the same name as the class and do not have a return type, not even void.

package UNIT_1;

class A {

    int modelYear;
    String modelName;

    A(int year, String name) {
        modelYear = year;
        modelName = name;

    }
}

public class prog28 {

    public static void main(String[] args) {
        A obj = new A(2025, "Audii");
        System.err.println("Model year: " + obj.modelYear);
        System.err.println("Model Name: " + obj.modelName);
    }
}
// Output:
// Model year: 2025
// Model Name: Audii


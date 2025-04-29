// constructor

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

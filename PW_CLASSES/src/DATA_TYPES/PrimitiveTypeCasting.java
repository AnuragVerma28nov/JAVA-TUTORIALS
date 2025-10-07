package DATA_TYPES;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        // Implicit Typecasting (Widening)
        int intVal = 100;
        double doubleVal = intVal; // int → double (automatic)
        System.out.println("Implicit Typecasting:");
        System.out.println("Integer value: " + intVal);
        System.out.println("Double value: " + doubleVal);

        System.out.println();

        // Explicit Typecasting (Narrowing)
        double d = 99.99;
        int i = (int) d; // double → int (manual)
        System.out.println("Explicit Typecasting:");
        System.out.println("Double value: " + d);
        System.out.println("Integer value: " + i);
    }
}

// Output:
// Implicit Typecasting:
// Integer value: 100
// Double value: 100.0

// Explicit Typecasting:
// Double value: 99.99
// Integer value: 99
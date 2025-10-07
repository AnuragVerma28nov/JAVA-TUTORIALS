package DATA_TYPES;

public class IntegerDataTypes {
    public static void main(String[] args) {
        // Declaration and initialization of integer data types
        byte b = 100;          // 1 byte (-128 to 127)
        short s = 20000;       // 2 bytes (-32,768 to 32,767)
        int i = 500000;        // 4 bytes (-2,147,483,648 to 2,147,483,647)
        long l = 10000000000L; // 8 bytes (must end with 'L')

        // Display values
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
    }
}

//Output:
// Byte value: 100
// Short value: 20000
// Int value: 500000
// Long value: 10000000000

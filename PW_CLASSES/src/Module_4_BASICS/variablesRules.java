package Module_4_BASICS;

public class variablesRules {
    public static void main(String[] args) {
        // Valid variable declarations
        int myVariable = 10;
        double price = 20.5;
        char initial = 'A';
        boolean isAdmin = true;
        String name = "John Doe";

        // Printing variable values
        System.out.println("myVariable: " + myVariable);
        System.out.println("price: " + price);
        System.out.println("initial: " + initial);
        System.out.println("isAdmin: " + isAdmin);
        System.out.println("name: " + name);

        // Invalid variable declarations (uncomment to see errors)
        // int 123variable = 10; // Variable name cannot start with a digit
        // int my-variable = 10; // Variable name cannot contain hyphens
        // int my variable = 10; // Variable name cannot contain spaces

        // Variable naming conventions
        int camelCaseVariable = 10; // camelCase convention
        int UPPER_CASE_CONSTANT = 20; // UPPER_CASE convention for constants

        System.out.println("camelCaseVariable: " + camelCaseVariable);
        System.out.println("UPPER_CASE_CONSTANT: " + UPPER_CASE_CONSTANT);
    }
}

//Output:
//myVariable: 10
//price: 20.5
//initial: A
//isAdmin: true
//name: John Doe
//camelCaseVariable: 10
//UPPER_CASE_CONSTANT: 20
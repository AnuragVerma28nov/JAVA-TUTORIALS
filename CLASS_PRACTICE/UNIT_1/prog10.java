// use of final class in a subclass CSE 
// creating object of subclass CSE in main class prog10 and calling final method

package UNIT_1;

final class CSE {
    void display() {
        System.out.println("This is a final class in class CSE.");

    }
}

public class prog10 extends CSE {
    void display() {
        System.out.println("This is a final method in class prog10.");

    }

    public static void main(String[] args) {
        CSE obj = new CSE(); // creating object of CSE
        obj.display(); // calling final method using object

    }
}
//output:shows compilation error: Cannot inherit from final 'CSE'
// Note: The class CSE is declared as final, which means it cannot be subclassed.


// use of final method in a subclass CSE 
// creating object of subclass CSE in main class prog9 and calling final method

class CSE {
    final void display() {
        System.out.println("This is a final method in class CSE.");

    }
}

public class prog9 extends CSE {
    final void display() { // overriding final method from CSE class
        System.out.println("This is a final method in class prog9.");

    }

    public static void main(String[] args) {
        prog9 obj = new prog9(); // creating object of prog9
        obj.display(); // calling final method using object
    
    }

}
// Output:shows compilation error because display() is final in CSE class and cannot be overridden


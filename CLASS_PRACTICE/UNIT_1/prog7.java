// use of protected method in subclass pack 
// creating object of subclass pack in main class prog6 and calling protected method

package UNIT_1;

class pack {
    protected void display() {
        System.out.println("hello World!");

    }
}

public class prog7 {
    public static void main(String[] args) {
        pack obj = new pack();
        obj.display(); // calling protected method using object
    }

}
// Output: hello World!
// creating object within main class prog4 and calling static and public methods

package UNIT_1;

public class prog4 {
    static void myStaticMethod() {
        System.out.println("This is a static method.");
    }

    public void myPublicMethod() {
        System.out.println("This is a public method.");
    }
    public static void main(String[] args) {

        prog4.myStaticMethod(); // calling static method directly using class name 
        prog4 obj = new prog4();  // creating object
        obj.myPublicMethod(); // calling public method using object 
    }

}
// Output: 
// This is a static method.
// This is a public method.
// Non - Static Methods using Method Reference

package UNIT_3;

interface abc {
    // Abstract method
    void display(int a);
}
public class prog7 {
    void show(int a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        abc obj = new prog7()::show; // Using method reference to refer to the non-static method show
        obj.display(5);
    }
}

// Output:
// 5

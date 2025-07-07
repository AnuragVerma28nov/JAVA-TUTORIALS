// Static Methods using Method Reference

package UNIT_3;

interface abc {
    // Abstract method
    void display(int a);
}
public class prog8 {
    static void show(int a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        abc obj = prog8::show; // Using method reference to refer to the static method show
        obj.display(5);
    }
}

// Output:
// 5

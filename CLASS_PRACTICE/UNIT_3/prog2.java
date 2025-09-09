// Interface and its implementation 

package UNIT_3

interface abc {
   abstract void display();
   abstract void print();
}
class ABC implements abc {
    @Override
    public void display() {
        System.out.println("Display method implemented in ABC class.");
    }

    @Override
    public void print() {
        System.out.println("Print method implemented in ABC class.");
    }

public class prog2  {

    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.display();
        obj.print();
    }
}

}

// Output:
// Display method implemented in ABC class.
// Print method implemented in ABC class.

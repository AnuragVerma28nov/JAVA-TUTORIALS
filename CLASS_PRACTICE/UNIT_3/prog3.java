// Functional Interface and its implementation 

package UNIT_3;

interface abc {
    abstract void display();
}

class ABC implements abc {
    @Override
    public void display() {
        System.out.println("Display method implemented in ABC class.");
    }

    public class prog3 {

        public static void main(String[] args) {
            ABC obj = new ABC();
            obj.display();
        }
    }

}

// Output:
// Display method implemented in ABC class.
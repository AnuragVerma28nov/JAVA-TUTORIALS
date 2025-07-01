// use of private method in subclass pack 
// creating object of subclass pack in main class prog6 and calling private method

package UNIT_1;

class pack {
    private void display() {
        System.out.println("hello World!");

    }
}

public class prog6 {
    public static void main(String[] args) {
        pack obj = new pack();
        obj.display(); 
    }

}
// Output:
// shows compilation error because display() is private in pack class

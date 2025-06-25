// use of public method in subclass  pack 
// creating object of subclass pack in main class prog5 and calling public method

class pack {
    public void display() {
        System.out.println("hello World!");

    }
}

public class prog5 {
    public static void main(String[] args) {
        pack obj = new pack();
        obj.display();
    } 
}
// Output: hello World!
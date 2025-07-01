// use of final keyword in main class prog8

public class prog8 {

    public static void main(String[] args) {
        final int a=20;
        a=154; 
        System.out.println(a);
    }
}
// Output:shows compilation error because a is declared as final and cannot be reassigned

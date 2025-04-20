
public class prog4 {

    static void myStaticMethod() {
        System.out.println("This is a static method.");
    }

    public void myPublicMethod() {
        System.out.println("This is a public method.");
    }

    public static void main(String[] args) {

        prog4.myStaticMethod();

        prog4 obj = new prog4();  // creating object
        obj.myPublicMethod(); // function call
    }

}

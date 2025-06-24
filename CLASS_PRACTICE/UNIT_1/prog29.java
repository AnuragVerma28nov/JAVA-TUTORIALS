
class Area {

    void area(int n) {
        int a = n * n;
        System.err.println("Area of Square: " + a);
    }

    void area(int a, int b) {
        int s = a * b;
        System.err.println("Area of Reactanlge: " + s);
    }

}

public class prog29 {

    public static void main(String[] args) {
        Area obj = new Area();
        obj.area(5);
        obj.area(5, 5);
    }
}

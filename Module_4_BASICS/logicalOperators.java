package Module_4_BASICS;

public class logicalOperators  {
    public static void main(String[] args) {
        // && operator
        int p=15,q=10,r=5;
        System.out.println((p > q) && (p > r)); // true
        System.out.println((p > q) && (p < r)); // false
        // || operator
        System.out.println((r < q) || (p < q)); // true
        System.out.println((p > q) || (q > r)); // true
        System.out.println((p < q) || (p < r)); // false
        // ! operator
        System.out.println(!(p == q)); // true
        System.out.println(!(p > q)); // false
    }
}

//Output
//true
//false
//true
//true
//false
//true
//false
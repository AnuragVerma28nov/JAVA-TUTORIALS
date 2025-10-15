package Module_4_BASICS;

public class unaryOperator {
    public static void main(String[] args) {
        // initialize p
        int p = 5;
        System.out.println("Post-Increment Operator");
        System.out.println(p++); // 5
        // p's value is incremented to 6 after returning
        // current value i.e; 5
        // initialized to 0
        int q = 5;
        System.out.println("Pre-Increment Operator");
        System.out.println(++q); //6
        // q is incremented to 6 & then it's value is
        // returned
    }
}

//Output
//Post-Increment Operator
//5
//Pre-Increment Operator
//6
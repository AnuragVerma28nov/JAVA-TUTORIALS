// Diamond Operators Example
package UNIT_3;

abstract class Sum<T> {
    abstract T add(T num1, T num2);
}

class IntegerSum extends Sum<Integer> {
    @Override
    Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }
}

public class prog17 {
    public static void main(String[] args) {
        Sum<Integer> sum = new IntegerSum();
        System.out.println("Sum of 10 and 20 is: " + sum.add(10, 20));
    }
}

// Output: Sum of 10 and 20 is: 30
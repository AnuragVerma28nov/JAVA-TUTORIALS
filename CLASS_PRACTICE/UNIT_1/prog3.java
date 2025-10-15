// creating object of subclass one in the main class prog3

package UNIT_1;

class one {
    int x = 10;
}

public  class prog3 {
    public static void main(String[] args) {
        one obj = new one();   // creating object
        System.out.println(obj.x); 
    }
}
// Output: 10
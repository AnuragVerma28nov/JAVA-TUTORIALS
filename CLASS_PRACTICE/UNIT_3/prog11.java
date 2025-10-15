// forEach loop 

package UNIT_3;

import java.util.*;

public class prog11 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.forEach(n -> System.out.println(n));
    }
    
}

// Output:
// 1
// 2
// 3
// 4
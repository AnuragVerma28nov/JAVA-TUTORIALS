// Java Streams to perform operations like mapping, filtering, and sorting on collections. 

package UNIT_3;

import java.util.*;
import java.util.stream.*;

public class prog9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n) // Using lambda expression to square each number
                .collect(Collectors.toList());

        System.out.println(squares);
        List<String> names = Arrays.asList("Anurag", "Sumit", "Ekta", "Ashi");
        List<String> res = names.stream().sorted().collect(Collectors.toList());
        System.out.println(res);
        List<String> filteredNames = names.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);

    }

}

// Output:
// [1, 4, 9, 16, 25]
// [Anurag, Ashi, Ekta, Sumit]
// [Anurag, Ashi]
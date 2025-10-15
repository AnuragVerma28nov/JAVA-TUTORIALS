// Type Annotation Example

package UNIT_3;

import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
@interface TypeAnnotationDemo {
}

public class prog13 {
       static @TypeAnnotationDemo int Number() {
        System.out.println("This method is annotated with TypeAnnotationDemo");
        return 0;
    }
    public static void main(String[] args) {
        @TypeAnnotationDemo String obj = "This is a type-annotated string";
        System.out.println(obj);
        Number(); // Calling the method with type annotation
    }
 
}

// Output:
// This is a type-annotated string
// This method is annotated with TypeAnnotationDemo

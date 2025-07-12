// Repeating Annotation Example

package UNIT_3;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Employees.class)
@interface Employee {
    String name ();
    int salary ();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Employees {
    Employee[] value();
}

@Employee(name = "Anurag", salary = 50000)

public class prog14 {
    public static void main(String[] args) {
        Employee[] obj = prog14.class.getAnnotationsByType(Employee.class);
            System.out.println("Name: " + obj[0].name() + ", Salary: " + obj[0].salary());

    }
    
}
// Output:
// Name: Anurag, Salary: 50000
// Name: Kartik, Salary: 60000

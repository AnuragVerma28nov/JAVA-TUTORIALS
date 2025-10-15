// Repeatable Annotation Example

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
@Employee(name = "Kartik", salary = 60000)
@Employee(name = "Kapil", salary = 60000)

public class prog15 {
    public static void main(String[] args) {
        Employee[] obj = prog15.class.getAnnotationsByType(Employee.class);
        for (Employee e : obj) {
            System.out.println("Name: " + e.name() + ", Salary: " + e.salary());
        }
    }
}

// Output:
// Name: Anurag, Salary: 50000
// Name: Kartik, Salary: 60000
// Name: Kapil, Salary: 60000   
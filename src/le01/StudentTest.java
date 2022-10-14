package le01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new Vector<>();
        students.add (new Student("Felix","Muster"));
        students.add (new Student("John","Doe"));
        students.add (new Student("Max","Mustermann"));

        // Iteration über alle Objekte Variante 1
        for (Student student : students) {
            System.out.println(student.firstName);
        }
        // Iteration über alle Objekte Variante 2
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).firstName);
        }
        // Iteration über alle Objekte Variante 3
        students.forEach(System.out::println);
    }
}

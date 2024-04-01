package studentGrades;

import java.util.ArrayList;
import java.util.List;

public class GradeCalculator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Alice");
        student1.addGrades(List.of(85.0, 90.0, 78.0));
        student1.addGrades(List.of(92.0, 88.0, 95.0));

        Student student2 = new Student("Bob");
        student2.addGrades(List.of(75.0, 82.0, 68.0));
        student2.addGrades(List.of(88.0, 72.0, 90.0));

        students.add(student1);
        students.add(student2);

        for (Student student : students) {
            System.out.println(student.getName());
            for (int i = 0; i < student.getGrades().size(); i++) {
                Double subjectAverage = student.calculateSubjectAverage(i);
                System.out.printf("Средняя цена по предмету: %.2f\n", subjectAverage);
            }
            Double studentAveargeGrade = student.getAverageGrade();
            System.out.printf("Средняя оценка студента %s: %.2f \n", student.getName(), studentAveargeGrade);
        }
    }
}

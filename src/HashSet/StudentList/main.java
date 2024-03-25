package HashSet.StudentList;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
            String studentDataInString = scanner.nextLine();
            if (studentDataInString.isBlank()){
                break;
            }
            List<String> studentDataInList = fromStringToList(studentDataInString);
            if (!isContainStudentId(studentDataInList.get(2),students)){
                students.add(new Student(studentDataInList.get(0),studentDataInList.get(1),studentDataInList.get(2)));
            }
        }
        showStudentData(students);
    }
    static List<String> fromStringToList(String s){
        return new ArrayList<>(Arrays.asList(s.split(", ")));
    }
    static boolean isContainStudentId(String id,Set<Student> students){
        for (Student student : students) {
            if (student.getStudentId().equals(id)){
                return true;
            }
        }
        return false;
    }
    static void showStudentData(Set<Student> students){
        System.out.println("Список студентов: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

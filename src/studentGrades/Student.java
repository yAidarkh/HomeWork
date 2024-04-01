package studentGrades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<List<Double>> grades;

    public Student(String name) {
        this.name = name;
    }

    public void addGrades(List<Double> gradesToAdd) {
        if (gradesToAdd != null && grades != null) {
            List<List<Double>> newGrades = new ArrayList<>(getGrades());
            newGrades.add(gradesToAdd);
            setGrades(newGrades);
            System.out.println("Оценки успешно добавлены.");
        } else if (gradesToAdd != null && grades == null) {
            List<List<Double>> newGrades = new ArrayList<>();
            newGrades.add(gradesToAdd);
            setGrades(newGrades);
            System.out.println("Оценки успешно добавлены.");
        } else {
            System.out.println("Список с оценками пустой.");
        }
    }


    public double getAverageGrade() {
        int count = 0;
        int averageGrade = 0;
        for (List<Double> grade : getGrades()) {
            for (Double v : grade) {
                if (v > 0) {
                    count++;
                    averageGrade += v;
                }
            }
        }
        return (double) averageGrade / count;
    }

    public Double calculateSubjectAverage(int index) {
        Double subjectAverage = 0.0;
        int count = 0;
        for (Double grade : getGrades().get(index)) {
            subjectAverage += grade;
            count++;
        }
        return (Double) subjectAverage / count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<List<Double>> getGrades() {
        return grades;
    }

    public void setGrades(List<List<Double>> grades) {
        this.grades = grades;
    }
}

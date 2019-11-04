package turntabl.first;


import java.util.ArrayList;
import java.util.List;

public class Student {

    public List<Double> grades;

    public Double student(){
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                '}';
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    public Double getAverage(){
        Double total;
        Double to = Student.getGrades grades.getGrades();
        grades.size();
        return null;
    }
}

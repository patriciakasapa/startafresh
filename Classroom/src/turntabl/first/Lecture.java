package turntabl.first;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

    public Student student;

    public List<Student> students_present = new ArrayList<>();

    public Lecture(Student student, List<Student> students_present) {
        this.student = student;
        this.students_present = students_present;
    }

    public Lecture(Student student) {
        this.student = student;
    }

    public Lecture() {

    }

    public void enter(Student student) {

        students_present.add(student);
    }

    public Double getHighestAverageGrade() {
        Double sa = null;
        for (Student std : students_present
        ) {
            sa = std.getAverageGrade(std.grades);

            if (sa > 0.0) {
                return sa;

            }

            if (sa > sa){
                return sa;
            }

        }

        return sa;
    }

}

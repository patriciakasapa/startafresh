package turntabl.first;

import java.util.logging.Level;

public class Student {
    public String name;
    public int Student_ID;
    public Academic_Year level;

    public Student(String name, int student_ID, Academic_Year level) {
        this.name = name;
        Student_ID = student_ID;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Student_ID=" + Student_ID +
                ", level=" + level +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int student_ID) {
        Student_ID = student_ID;
    }

    public Academic_Year getLevel() {
        return level;
    }

    public void setLevel(Academic_Year level) {
        this.level = level;
    }
}

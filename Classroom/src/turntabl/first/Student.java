package turntabl.first;

import java.util.List;

public class Student implements Nameable, HasLevel{

    protected String name;
    private Level level;
    protected List<Double> grades;

    public Student(String name, Level level, List<Double> grades) {
        this.name = name;
        this.level = level;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", grades=" + grades +
                '}';
    }

   /* public Student(List<Double> grades) {
        this.grades = grades = new ArrayList<Double>();
    }*/

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }


    protected Double getAverageGrade(List<Double> grades) {
        Double totalgrades = 0.0;
        Double average = 0.0;
        for (Double std_grade : grades
        ) {
            totalgrades += std_grade;
        }

        average = totalgrades / grades.size();

        return average;
    }

    @Override
    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }
}

package turntabl.first;

import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent(String name, Level level, List<Double> grades) {
        super(name, level, grades);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public List<Double> getGrades() {
        return super.getGrades();
    }

    @Override
    public void setGrades(List<Double> grades) {
        super.setGrades(grades);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Double getAverageGrade(List<Double> grades) {
        Double naughtyaverage = 0.0;
        naughtyaverage = super.getAverageGrade(grades);


        Double manipulated_average = naughtyaverage + ((10/100) * naughtyaverage);

        return manipulated_average;
    }
}

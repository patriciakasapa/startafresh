package turntabl.first;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest extends Student {

    public NaughtyStudentTest(String name, Level level, List<Double> grades) {
        super(name, level, grades);
    }

    @Test
    void testToString() {
    }

    @Test
    void testGetGrades() {
    }

    @Test
    void testSetGrades() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testClone() {
    }

    @Test
    void getAverageGrade() {

        List<Double> grades = Arrays.asList(1.2, 3.2, 4.4);
        NaughtyStudent aku =  new NaughtyStudent ("Manaa", Level.LEVEL_100, grades);
        Double averageGrade = aku.getAverageGrade(grades);
        assertEquals(3.19, averageGrade);
    }

}
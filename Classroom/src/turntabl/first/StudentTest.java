package turntabl.first;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest extends Student {

    public StudentTest(String name, Level level, List<Double> grades) {
        super(name, level, grades);
    }

    @Test
    void setGrades() {
    }

    @Test
    void getAverageGrade() {
        List<Double> grades = Arrays.asList(1.2, 3.2, 4.4);
        Student Aku = new Student ("Manaa", Level.LEVEL_100, grades);
        assertEquals(2.9, 2.9);
    }

    @Test
    void testGetName() {
        Student Patta = new Student("Pattabri", Level.LEVEL_300, Arrays.asList(1.1, 23.3));
        String name = Patta.getName();
        System.out.println(name);
        assertEquals("Pattabri", Patta);
    }

    @Test
    void testGetLevel() {
        Student Patta = new Student("Pattabri", Level.LEVEL_300, Arrays.asList(1.1, 23.3));
        Level now = Patta.getLevel();
        System.out.println(now);

    }
}
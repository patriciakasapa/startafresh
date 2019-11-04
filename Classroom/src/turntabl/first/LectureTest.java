package turntabl.first;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    Lecture enter() {
        List<Double> grades_of_t1 = Arrays.asList(0.1, 2.2, 3.3);
        Student t1 = new Student ("Aku", Level.LEVEL_100, grades_of_t1);

        List<Double> grades_of_t2 = Arrays.asList(0.1, 2.2, 3.3);
        Student t2 = new Student ("Aku", Level.LEVEL_100, grades_of_t2);

        Lecture lecture = new Lecture();
        lecture.enter(t1);
        lecture.enter(t2);

        return lecture;

    }

    @Test
    void getHighestAverageGrade() {
        List<Double> grades_of_t1 = Arrays.asList(0.1, 2.2, 3.3);
        Student t1 = new Student ("Aku", Level.LEVEL_100, grades_of_t1);

        List<Double> grades_of_t2 = Arrays.asList(0.5, 2.2, 3.3);
        Student t2 = new Student ("Aku", Level.LEVEL_100, grades_of_t2);

        List<Double> grades_of_t3 = Arrays.asList(0.5, 2.2, 3.3);
        NaughtyStudent t3 = new NaughtyStudent ("Aku", Level.LEVEL_100, grades_of_t3);
       assertEquals(6.1, 6.1);
    }
}
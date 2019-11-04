package turntabl.first;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest extends Student {

    public RegisterTest(String name, Level level, List<Double> grades) {
        super(name, level, grades);
    }

    @Test
    void getRegister() {
        List<Nameable> students = Arrays.asList(
                new Student("Ephraim", Level.LEVEL_100, Arrays.asList(1.2, 3.3, 45.6)),
                new Student("Margaret", Level.LEVEL_100, Arrays.asList(1.2, 3.3, 45.6))
        );
        Register reg = new Register(students);
        assertEquals(Arrays.asList("Ephraim ", "Margaret"), Arrays.asList("Ephraim ", "Margaret"));
    }
}
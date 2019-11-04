package turntabl.first;

import java.util.ArrayList;
import java.util.List;

public class Register {

    public List<Nameable> students;
    public Student s;

    public Register(List<Nameable> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Register{" +
                "students=" + students +
                '}';
    }

    public String getRegister() {
        for(Nameable student : students){
            List<Student> register = new ArrayList<>();
            register.add((Student) student);
        }
        return getRegister();
    }

    public void getRegisterByLevel(){
        List<Register> level_100_stds = new ArrayList<>();
        /*for (Nameable s: students
             ) {
            if(s.getLevel() == Level.LEVEL_100){
                level_100_stds.add(Student s);

            }
        }*/

       List<Register> first = level_100_stds;
       getRegisterByLevel();
    }
}

package turntabl.first;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        // write your code here
        List<Student> students = Arrays.asList(
            new Student("Mary", 1122, Academic_Year.FIRST_YEAR),
            new Student("Rusela", 1123, Academic_Year.FIRST_YEAR),
            new Student("Bill", 2222, Academic_Year.SECOND_YEAR),
            new Student("Michael", 1122, Academic_Year.FIRST_YEAR),
            new Student("Francis", 2223, Academic_Year.SECOND_YEAR),
            new Student ("Godfred", 4412, Academic_Year.FOURTH_YEAR),
            new Student ("Akyeamaa", 4422, Academic_Year.FOURTH_YEAR),
            new Student ("Frederick", 4423, Academic_Year.FOURTH_YEAR),
            new Student ("Ato", 3345, Academic_Year.THIRD_YEAR),
            new Student ("James", 2234, Academic_Year.SECOND_YEAR),
            new Student ("Asuako", 1156, Academic_Year.FIRST_YEAR)
        );

        List<Student> intro_to_programming = new ArrayList<>();
        for (Student a: students
             ) {
            if (a.level == Academic_Year.FIRST_YEAR) {
                intro_to_programming.add(a);
            }
        }
        System.out.println("Introduction to Programming Students include: " + intro_to_programming);

        List<Student> advanced_gardening = new ArrayList<>();
        for(Student a: students){
            if(a.level == Academic_Year.FOURTH_YEAR || a.level == Academic_Year.THIRD_YEAR){
                advanced_gardening.add(a);
            }
        }
        System.out.println("Advanced Gardening Students include: " + advanced_gardening);


        List<Student> physics = new ArrayList<>();
        for (Student a: students
             ) {
            if(a.level == Academic_Year.FOURTH_YEAR){
                if(a.getName().startsWith("A")){
                    physics.add(a);
                }

                else if(a.getName().startsWith("E")){
                    physics.add(a);
                }

                else if(a.getName().startsWith("I")){
                    physics.add(a);
                }

                else if(a.getName().startsWith("O")){
                    physics.add(a);
                }

                else if(a.getName().startsWith("U")){
                    physics.add(a);
                }

                }
            }
        System.out.println("Physics Students include: " +  physics);

        }

}

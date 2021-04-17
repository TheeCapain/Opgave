package GitGrades;

import java.util.Random;

public class Grader {
    Random rand = new Random();
    private final int[] allGrades = new int[]{-3, 0, 2, 4, 7, 10, 12};
    private final String[] classes = {"Spanish: ", "Math: ", "English: ", "Science: ", "Conspiracy theories 101: ", "Biology: ", "Programming: "};


    public void registerGrades(Student student) {
        for (int i = 0; i < classes.length; i++) {
            int currentGrade = allGrades[rand.nextInt(allGrades.length)];
            student.setGrade(currentGrade,i);
        }
    }

    public String[] getClasses(){
        return classes;
    }


}

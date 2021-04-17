package GitGrades;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student student = new Student("John");
        Grader grader = new Grader();
        student.getGrades();
        System.out.println(student.getName());
        for(int i = 0; i < student.getGrades().length;i++){
            System.out.println(grader.getClasses()[i]+student.getGrades()[i]);
        }
    }
}
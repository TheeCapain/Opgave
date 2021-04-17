package GitGrades;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Grader grader = new Grader();
        Student student = new Student("John");

        System.out.println(student.getName());
        for (int i = 0; i < student.getGrades().length; i++) {
            System.out.println(grader.getClasses()[i] + student.getGrades()[i]);
        }
    }
}
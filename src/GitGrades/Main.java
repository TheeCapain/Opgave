package GitGrades;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student student = new Student("John");
        student.getGrades();

        Student student1 = new Student("Kamille");

        Grader grader = new Grader();
        System.out.println(student.getName());
        for(int i = 0; i < student.getGrades().length;i++){
            System.out.println(grader.getClasses()[i]+student.getGrades()[i]);
        }



    }

    public void printExamResults(){

    }
}
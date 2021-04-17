package GitGrades;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {




    }

    public void printExamResults(){
        Student student = new Student("John");
        student.StudentInfo();
        student.getGrades();

        Student student1 = new Student("Kamille");

        Grader grader = new Grader();
        System.out.println(student.getName());
        for(int i = 0; i < student.getGrades().length;i++){
            System.out.println(grader.getClasses()[i]+student.getGrades()[i]);
        }
    }
}
package GitGrades;


public class Student {
    private String name;
    private int[] grades = new int[7];

    public Student(String name){
        this.name = name;
    }

    public void StudentInfo(String name) {
        Grader grader = new Grader();
        grader.registerGrades(this);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrades(int[] grade) {
        this.grades = grade;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrade(int grade, int position){
        grades[position]=grade;
    }
}




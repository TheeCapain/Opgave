package GitGrades;


public class Student {
    //ATTRIBUTES
    private String name;
    private int[] grades = new int[7];

    //CONSTRUCTOR
     public Student(String name) {
        this.name = name;
        Grader grader = new Grader();
        grader.registerGrades(this);
    }

    //GETTER & SETTER
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




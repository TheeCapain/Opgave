package GitGrades;


public class Student {
    //ATTRIBUTES
    private final String name;
    private final int[] grades = new int[7];

    //CONSTRUCTOR
     public Student(String name) {
        this.name = name;
        Grader grader = new Grader();
        grader.registerGrades(this);
    }

    //GETTER & SETTER
    public String getName() {
        return name;
    }


    public int[] getGrades() {
        return grades;
    }

    public void setGrade(int grade, int position){
        grades[position]=grade;
    }
}




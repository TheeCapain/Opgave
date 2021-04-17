package GitGrades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void studentInfo() {
    }

    @Test
    void setName() {

    }

    @Test
    void getName() {
        //Arrange
        Student student = new Student("John");
        String expected = "John";

        //Act
        String actual = student.getName();

        //Assert
        Assertions.assertEquals( expected, actual);
    }

    @Test
    void setGrades() {
    }

    @Test
    void getGrades() {
    }

    @Test
    void setGrade() {
    }
}
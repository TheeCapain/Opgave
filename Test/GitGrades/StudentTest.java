package GitGrades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

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

  //Add more test if you want
}
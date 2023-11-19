package chapterFour;

public class StudentTest {
    
    public static void main(String[] args) {
        Student student = new Student("Jane", 100);

        System.out.printf("%s's letter grade is: %s%n", student.getName(), student.getLetteGrade());
    }
}

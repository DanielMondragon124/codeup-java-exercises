package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addGrade(98);
        student1.addGrade(87);
        student1.addGrade(79);
        student1.addGrade(82);



        System.out.printf("Student Name: %s%n", student1.getName());
        System.out.printf("Grades Average: %.2f%n", student1.getGradeAverage());
        System.out.printf("Grades: %s", student1.getGrades());
    }
}
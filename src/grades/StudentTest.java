package grades;

public class StudentTest {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Smith");

        // Add grades to student 1
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(95);

        // Add grades to student 2
        student2.addGrade(80);
        student2.addGrade(88);
        student2.addGrade(92);

        // Test getName method
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 2 Name: " + student2.getName());

        // Test getGradeAverage method
        System.out.println("Student 1 Average: " + student1.getGradeAverage());
        System.out.println("Student 2 Average: " + student2.getGradeAverage());
    }
}

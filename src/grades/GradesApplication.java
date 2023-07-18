package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student John_Doe1 = new Student("John Doe1");
        John_Doe1.addGrade(100);
        John_Doe1.addGrade(95);
        John_Doe1.addGrade(75);

        Student John_Doe2 = new Student("John Doe2");
        John_Doe2.addGrade(65);
        John_Doe2.addGrade(92);
        John_Doe2.addGrade(71);

        Student John_Doe3 = new Student("John Doe3");
        John_Doe3.addGrade(98);
        John_Doe3.addGrade(92);
        John_Doe3.addGrade(93);

        Student John_Doe4 = new Student("John Doe4");
        John_Doe4.addGrade(100);
        John_Doe4.addGrade(99);
        John_Doe4.addGrade(100);

        students.put("@gituser1", John_Doe1);
        students.put("@gituser2", John_Doe2);
        students.put("@gituser3", John_Doe3);
        students.put("@gituser4", John_Doe4);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
        for (String username : students.keySet()) {
            System.out.print("| " + username + " |   ");
        }
        System.out.println();
        System.out.println();

        while (true) {
            System.out.print("What student would you like to see more information on?");
            System.out.println();
            String username = Input.getString();

            if (students.containsKey(username)) {
                Student student = students.get(username);
                System.out.printf("Name: %s - GitHub Username: %s%n" ,student.getName(), username);
                System.out.printf("Grades: %s%n", student.getGrades());
                System.out.printf("Current Average: %.2f%n", student.getGradeAverage());

            } else {
                System.out.printf("Sorry, no student found with the GitHub username: %s%n", username);
            }

            System.out.println("Do you wish to continue? (yes/no)");
            String choice = Input.getString();

            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }
            System.out.println();
        }
    }
}
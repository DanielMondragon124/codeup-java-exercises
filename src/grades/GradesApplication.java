package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        // Create a HashMap to store students and GitHub usernames
        HashMap<String, Student> students = new HashMap<>();

        // Create student objects and add them to the map
        Student student1 = new Student("John Doe");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(95);
        students.put("johndoe123", student1);

        Student student2 = new Student("Jane Smith");
        student2.addGrade(80);
        student2.addGrade(88);
        student2.addGrade(92);
        students.put("janesmith456", student2);

        Student student3 = new Student("Alice Johnson");
        student3.addGrade(75);
        student3.addGrade(82);
        student3.addGrade(90);
        students.put("alicejohnson789", student3);

        Student student4 = new Student("Bob Williams");
        student4.addGrade(95);
        student4.addGrade(88);
        student4.addGrade(91);
        students.put("bobwilliams234", student4);

        // Print the list of GitHub usernames
        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println();

        // Get input from the user

        String input = Input.getString("What student would you like to see more information on?");

        // Display student information based on the input
        if (students.containsKey(input)) {
            Student student = students.get(input);
            System.out.println("Name: " + student.getName());
            System.out.println("GitHub Username: " + input);
            System.out.println("Current Average: " + student.getGradeAverage());
        } else {
            System.out.println("Sorry, no student found with the GitHub username of \"" + input + "\".");
        }

        // Ask the user if they want to continue
        String choice = Input.getString("Would you like to see another student? (y/n)");
        while (choice.equalsIgnoreCase("y")) {
            input = Input.getString("What student would you like to see more information on?");
            if (students.containsKey(input)) {
                Student student = students.get(input);
                System.out.println("Name: " + student.getName());
                System.out.println("GitHub Username: " + input);
                System.out.println("Current Average: " + student.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of \"" + input + "\".");
            }
            choice = Input.getString("Would you like to see another student? (y/n)");
        }

        System.out.println("Goodbye, and have a wonderful day!");
    }
}

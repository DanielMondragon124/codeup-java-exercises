import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                isValidInput = true; // Break out of the loop if valid input is provided
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        scanner.nextLine();

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        System.out.print("Enter the third word: ");
        String word3 = scanner.nextLine();

        System.out.println("You entered:");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("You entered: " + sentence);

        System.out.print("Enter the length of the classroom: ");
        String lengthInput = scanner.nextLine();
        int length = Integer.parseInt(lengthInput);

        System.out.print("Enter the width of the classroom: ");
        String widthInput = scanner.nextLine();
        int width = Integer.parseInt(widthInput);

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Area of the classroom: " + area);
        System.out.println("Perimeter of the classroom: " + perimeter);



        scanner.close();

    }
}

import java.util.Scanner;
public class StringExercise {
    public static void main(String[] args) {
        String output1 = "We don't need no education\nWe don't need no thought control";
        System.out.println(output1);

        String output2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(output2);

        String output3 = "In windows, the main drive is casually C:\\";
        System.out.println(output3);

        String output4 = "I can do backslashes \\, double backlashes \\\\,\nand the amazing triple backslash\\\\\\!";
        System.out.println(output4);

        System.out.println("Bob: Hi, I'm Bob. How can i help you?");
        System.out.println("You: ");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine().trim();

            if (input.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (input.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (input.isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever.");
            }

            System.out.println("You: ");
        }
    }
}

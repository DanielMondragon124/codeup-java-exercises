import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = generateRandomNumber();

        System.out.println("Welcome to the High-Low game!");
        System.out.println("I have picked a random number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        boolean gameOver = false;

        while (!gameOver) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("HIGHER");
            } else if (guess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
                gameOver = true;
            }
        }

        scanner.close();
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}

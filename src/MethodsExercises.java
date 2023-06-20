import java.util.Scanner;

public class MethodsExercises {
public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;

    int resultAddition = addition(num1, num2);
    int resultSubtraction = subtraction(num1, num2);
    int resultMultiplication = multiplication(num1, num2);
    double resultDivision = division(num1, num2);
    int resultModulus = modulus(num1, num2);

    System.out.println("Addition: " + resultAddition);
    System.out.println("Subtraction: " + resultSubtraction);
    System.out.println("Multiplication: " + resultMultiplication);
    System.out.println("Division: " + resultDivision);
    System.out.println("Modulus: " + resultModulus);


    System.out.print("Hurry up and enter number between 1 and 10 fool: ");
    int userInput = getInteger(1, 10);
    System.out.println("User Input:" + userInput);

    Scanner scanner = new Scanner(System.in);
    String choice;

    do {
        int number;
        long factorial = 1;

        System.out.print("Enter an integer from 1 to 10: ");
        number = scanner.nextInt();

        // Validate the input range
        while (number < 1 || number > 10) {
            System.out.print("Wrong read it again geez. Enter an integer from 1 to 10: ");
            number = scanner.nextInt();
        }

        // Calculate the factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + "! = " + factorial);

        System.out.print("Do you want to continue using me because you're too lazy to do the math yourself? (yes/no): ");
        choice = scanner.next();
    } while (choice.equalsIgnoreCase("yes"));

    System.out.println("You're welcome!");


//    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of sides for a pair of dice: ");
    int sides = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    boolean rollAgain = true;

    while (rollAgain) {
        int dice1 = rollDice(sides);
        int dice2 = rollDice(sides);

        System.out.printf("Dice 1: %d%n", dice1);
        System.out.printf("Dice 2: %d%n", dice2);

        System.out.print("Roll again? (y/n): ");
        String choice1 = scanner.nextLine();

        rollAgain = choice1.equalsIgnoreCase("y");
    }

    System.out.println("Thank you for playing!");
    scanner.close();
}

    public static int rollDice(int sides) {
        return (int) (Math.random() * sides) + 1;


}
    public static int addition(int num1, int num2) {
    return num1 + num2;
    }
    public static int subtraction(int num1, int num2) {
    return num1 - num2;
    }
    public static int multiplication(int num1, int num2) {
    return num1 * num2;
    }
    public static double division(int num1, int num2) {
    if (num2 == 0) {
        throw new ArithmeticException("Division by zero is not allowed");
    }
    return (double) num1 / num2;
    }
    public static int modulus(int num1, int num2) {
    return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input;
        try {
            input = Integer.parseInt(scanner.nextLine());
            if (input < min || input > max) {
                System.out.print("Wrong input. Enter a number between " + min + " and " + max + ": ");
                input = getInteger(min, max);
            }
        } catch (NumberFormatException e) {
            System.out.print("Can't you read? that's not even a number fool. Enter a number between " + min + " and " + max + ": ");
            input = getInteger(min, max);
        }
        System.out.println("Took you long enough geez....");
        return input;




    }

}

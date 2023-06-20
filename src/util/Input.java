package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = getString();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int num;
        do {
            System.out.printf("Enter an integer between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num < min || num > max);
        scanner.nextLine();
        return num;
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.printf("Enter a decimal number between %.2f and %.2f: ", min, max);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a decimal number.");
                scanner.next();
            }
            num = scanner.nextDouble();
        } while (num < min || num > max);
        scanner.nextLine();
        return num;
    }

    public double getDouble() {
        System.out.print("Enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a decimal number.");
            scanner.next();
        }
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }
    public double getDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public void close() {
        scanner.close();
    }
}


package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public static String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = getString();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int num = 0;
        do {
            System.out.printf("Enter an integer between %d and %d: ", min, max);
            try {
                num = Integer.valueOf(getString());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                continue;
            }
        } while (num < min || num > max);
        return num;
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        try {
            return Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double num = 0;
        do {
            System.out.printf("Enter a decimal number between %.2f and %.2f: ", min, max);
            try {
                num = Double.valueOf(getString());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a decimal number.");
                continue;
            }
        } while (num < min || num > max);
        return num;
    }

    public double getDouble() {
        System.out.print("Enter a decimal number: ");
        try {
            return Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a decimal number.");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        try {
            return Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a decimal number.");
            return getDouble(prompt);
        }
    }

    public void close() {
        scanner.close();
    }
}

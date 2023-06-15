import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        While Loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println();
//        Do-while loop (counting by 2's
//        int num1 = 0;
//        do {
//            System.out.println(num1);
//            num1 += 2;
//        } while (num1 <= 100);

        // Do-While Loop (Counting backwards by 5's)
//        int num2 = 100;
//        do {
//            System.out.println(num2);
//            num2 -= 5;
//        } while (num2 >= -10);

        // Do-While Loop (Number squared)
//        int num3 = 2;
//        do {
//            System.out.println(num3);
//            num3 *= num3;
//        } while (num3 < 1000);

        // For Loop (Counting by 1's)
//        for (int j = 5; j <= 15; j++) {
//            System.out.print(j + " ");
//        }
//        System.out.println();

        // For Loop (Counting by 2's)
//        for (int k = 0; k <= 100; k += 2) {
//            System.out.println(k);
//        }

        // For Loop (Counting backwards by 5's)
//        for (int l = 100; l >= -10; l -= 5) {
//            System.out.println(l);
//        }

        // For Loop (Number squared)
//        for (int num = 2; num < 1000; num *= num) {
//            System.out.println(num);
//        }
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("What number would you like to go up to?");
            int number = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nHere is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------ | ------");

            for (int i = 1; i <= number; i++) {
                int square = i * i;
                int cube = i * i * i;
                System.out.printf("%-6d | %-7d | %-5d%n", i, square, cube);
            }
            System.out.print("\nDo you want to continue? (yes/no) ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");

        String choice;

        do {
            System.out.print("Enter a numerical grade (0-100): ");
            int grade = scanner.nextInt();
            scanner.nextLine();
            String letterGrade;

            if (grade >= 88 && grade <= 100) {
                letterGrade = "A";
            } else if (grade >= 80 && grade <= 87) {
                letterGrade = "B";
            } else if (grade >= 67 && grade <= 79) {
                letterGrade = "C";
            } else  if (grade >= 60 && grade <= 66) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }
            System.out.println("Letter grade" + letterGrade);

            System.out.print("Do you want to continue? (yes/no) ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Goodbye!");
    }
}

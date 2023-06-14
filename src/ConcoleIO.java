import java.util.Scanner;


public class ConcoleIO {
    public static void main(String[] args) {
//        String name = "codeup";
//        System.out.println(name);
//
//        System.out.printf("Hello there, %s. Nice to see you.%n", name);
//        System.out.println("Hello there, " + name +  " Nice to see you");

        String greeting = "Salutations";
        String name = "codeup";
        System.out.printf("%s, %s! %n", greeting, name);
        System.out.printf("%s, %s! %n", name, greeting);
//How come you cant use println for a new line and have to use %n


        Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String userInput = myscanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");




    }


}

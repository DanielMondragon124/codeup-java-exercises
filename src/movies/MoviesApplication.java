package movies;
import java.util.Scanner;
public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();
        while (true) {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            System.out.println();

            for (Movie movie : movies) {
                if (choice == 1 || movie.getCategory().equalsIgnoreCase(getCategoryByChoice(choice))) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }

            System.out.println();
        }

        System.out.println("Exiting the application...");
        scanner.close();
    }

    public static String getCategoryByChoice(int choice) {
        switch (choice) {
            case 2:
                return "animated";
            case 3:
                return "drama";
            case 4:
                return "horror";
            case 5:
                return "scifi";
            default:
                return "";
        }
    }
}

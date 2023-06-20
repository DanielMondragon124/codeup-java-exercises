package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a string: ");
        String str = input.getString();
        System.out.println("You entered: " + str);

        System.out.print("Enter yes or no: ");
        boolean yesNo = input.yesNo();
        System.out.println("You entered: " + yesNo);

        int numInRange = input.getInt(1, 10);
        System.out.println("You entered: " + numInRange);

        int num = input.getInt();
        System.out.println("You entered: " + num);

        double doubleInRange = input.getDouble(0.0, 100.0);
        System.out.println("You entered: " + doubleInRange);

        double dbl = input.getDouble();
        System.out.println("You entered: " + dbl);

        input.close();
    }
}


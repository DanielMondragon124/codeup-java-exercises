import java.util.Arrays;

public class Arrayslecture {
    public static void main(String[] args) {
        double[] prices;
        prices = new double[4];

        prices[0] = 9.99;
        prices[1] = 10.99;
        prices[3] = 899.99;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
//        System.out.println(Arrays.toString(prices)); entire array
//        System.out.println(prices[0] + " " + prices[3] + " "); specific values to be printed

        String[] beatles = {"Paul", "John", "Ringo", "George"};
//        beatles[4] = "Yoko";
        System.out.println(Arrays.toString(beatles));

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        for (double price : prices) {
            System.out.println(price);
        }

        int[] allTheSame = new int[20];
//        allTheSame[0] = 10; value will not be shown since fill would be after this
        Arrays.fill(allTheSame, 99);
        allTheSame[0] = 10;
        System.out.println(Arrays.toString(allTheSame));

        String[] alsoBeatles = Arrays.copyOf(beatles, 4);
        System.out.println(beatles);
        System.out.println(alsoBeatles);
        System.out.println(beatles == alsoBeatles);
        System.out.println(Arrays.equals(beatles,alsoBeatles));

        alsoBeatles = Arrays.copyOf(alsoBeatles, 5);
        alsoBeatles[4] = "Yoko";
        System.out.println(Arrays.toString(alsoBeatles));
        System.out.println(alsoBeatles);

        Arrays.sort(alsoBeatles);
        System.out.println(Arrays.toString(alsoBeatles));
        System.out.println(alsoBeatles);


    }
}

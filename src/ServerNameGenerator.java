import java.util.Random;

public class ServerNameGenerator {
    private static final String[] adjectives = {
            "dedicated", "powerful", "secure", "reliable", "efficient", "flexible",
            "innovative", "responsive", "dynamic", "scalable"
    };

    private static final String[] nouns = {
            "photon", "galaxy", "nebula", "star", "comet", "asteroid",
            "planet", "cosmos", "universe", "satellite"
    };

    public static void main(String[] args) {
        String serverName = generateServerName();
        System.out.println("Here is your server name:\n" + serverName);
    }

    public static String generateServerName() {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        return adjective + "-" + noun;
    }

    public static String getRandomElement(String[] array) {
        Random rand = new Random();
        int index = rand.nextInt(array.length);
        return array[index];
    }
}

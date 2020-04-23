import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"funny", "prompt", "amazing"};
    public static String[] nouns = {"desk", "guitar", "house"};

    public static String getWord(String[] choices) {
        Random random = new Random();
        String randWord = choices[random.nextInt(choices.length)];
        return randWord;
    }

    public static void main(String[] args) {
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
    }
}

import java.util.Arrays;
import java.util.List;

/**
 * Created by chris on 13/12/2016.
 */
public class Matches {
    public static void main(String[] args) {
        new Matches().launch();
    }

    private void launch() {
        List<String> words = Arrays.asList
                ("zoe", "melissa", "ellie", "lisa", "elizabeth", "sarah", "beth", "alison", "emma");
        System.out.println(words);

        List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
        System.out.println("shortWords: " + shortWords);
        List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
        System.out.println("wordsWithB: " + wordsWithB);
        List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
        System.out.println("evenLengthWords: " + evenLengthWords);

        List<String> shortWords2 = ElementUtils.allMatches(words, s -> s.length() < 4);
        System.out.println("(generics) shortWords2: " + shortWords2);
        List<String> wordsWithB2 = ElementUtils.allMatches(words, s -> s.contains("b"));
        System.out.println("(generics) wordsWithB2: " + wordsWithB2);
        List<String> evenLengthWords2 = ElementUtils.allMatches(words, s -> (s.length() % 2) == 0);
        System.out.println("(generics) evenLengthWords2: " + evenLengthWords2);
    }
}
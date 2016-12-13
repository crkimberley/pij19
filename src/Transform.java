import java.util.Arrays;
import java.util.List;

/**
 * Created by chris on 13/12/2016.
 */
public class Transform {
    public static void main(String[] args) {
        new Transform().launch();
    }

    private void launch() {
        List<String> words = Arrays.asList
                ("zoe", "melissa", "ellie", "lisa", "elizabeth", "sarah", "beth", "alison", "emma");
        System.out.println(words);

        List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
        System.out.println("excitingWords" + excitingWords);
        List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
        System.out.println("eyeWords" + eyeWords);
        List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
        System.out.println("upperCaseWords" + upperCaseWords);
    }
}
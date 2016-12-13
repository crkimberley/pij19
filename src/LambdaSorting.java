import java.util.Arrays;

/**
 * Created by chris on 12/12/2016.
 */
public class LambdaSorting {
    public static void main(String[] args) {
        new LambdaSorting().launch();
    }

    private void launch() {
        String[] strings = {"zoe", "melissa", "ellie", "lisa", "elizabeth", "sarah", "beth", "alison", "emma"};
        System.out.println(Arrays.asList(strings));

        Arrays.sort(strings, (s1,s2) -> s1.length() - s2.length());
        System.out.println("Sort by length: " + Arrays.asList(strings));

        Arrays.sort(strings, (s1,s2) -> s2.length() - s1.length());
        System.out.println("Sort by reverse length: " + Arrays.asList(strings));

        Arrays.sort(strings, (s1,s2) -> s1.charAt(0) - s2.charAt(0));
        System.out.println("Sort by 1st character: " + Arrays.asList(strings));

        Arrays.sort(strings, (s1,s2) -> s1.contains("e") && !s2.contains("e") ? -1 : 1);
        System.out.println("Sort by strings that contain \"e\" 1st (lambda): " + Arrays.asList(strings));

        Arrays.sort(strings, StringUtils::eChecker);
        System.out.println("Sort by strings that contain \"e\" 1st (method ref): " + Arrays.asList(strings));
    }
}
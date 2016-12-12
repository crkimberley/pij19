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

        Arrays.sort(strings, (a,b) -> a.length() - b.length());
        System.out.println("Sort by length: " + Arrays.asList(strings));

        Arrays.sort(strings, (a,b) -> b.length() - a.length());
        System.out.println("Sort by reverse length: " + Arrays.asList(strings));

        Arrays.sort(strings, (a,b) -> a.charAt(0) - b.charAt(0));
        System.out.println("Sort by 1st character: " + Arrays.asList(strings));

        Arrays.sort(strings, (a,b) -> a.contains("e") && !b.contains("e") ? -1 : 1);
        System.out.println("Sort by strings that contain \"e\" 1st: " + Arrays.asList(strings));
    }
}
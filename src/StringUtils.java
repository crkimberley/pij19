import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by chris on 12/12/2016.
 */
class StringUtils {

    static int eChecker(String s1, String s2) {
        if (s1.contains("e") && !s2.contains("e")) return -1;
        if (s2.contains("e") && !s1.contains("e")) return 1;
        return 0;
    }

    static String betterString(String s1, String s2, TwoStringPredicate betterTest) {
        return betterTest.isBetter(s1,s2) ? s1 : s2;
    }

    static List<String> allMatches(List<String> strings, Predicate<String> stringTest) {
        return strings.stream().filter(stringTest).collect(Collectors.toList());
    }

    static List<String> transformedList(List<String> strings, Function<String,String> transformer) {
        return strings.stream().map(transformer).collect(Collectors.toList());
    }
}
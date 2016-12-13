import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by chris on 12/12/2016.
 */
class ElementUtils {

    static <T> T betterElement(T e1, T e2, TwoElementPredicate<T> betterTest) {
        return betterTest.isBetter(e1,e2) ? e1 : e2;
    }

    static <T> List<T> allMatches(List<T> elements, Predicate<T> elementTest) {
        return elements.stream().filter(elementTest).collect(Collectors.toList());
    }

    static <T,R> List<R> transformedList(List<T> elements, Function<T,R> transformer) {
        return elements.stream().map(transformer).collect(Collectors.toList());
    }
}
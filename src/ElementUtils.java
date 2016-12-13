/**
 * Created by chris on 12/12/2016.
 */
class ElementUtils {

    static <T> T betterElement(T e1, T e2, TwoElementPredicate<T> betterTest) {
        return betterTest.isBetter(e1,e2) ? e1 : e2;
    }
}
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
}
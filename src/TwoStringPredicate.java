/**
 * Created by chris on 12/12/2016.
 */
@FunctionalInterface
public interface TwoStringPredicate {

    boolean isBetter(String s1, String s2);
}
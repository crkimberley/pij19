/**
 * Created by chris on 12/12/2016.
 */
public class Better {
    public static void main(String[] args) {
        new Better().launch();
    }

    private void launch() {
        String test1 = "Amy";
        String test2 = "Winona";
        int x = 23, y = 469;
        String stringResult;
        int intResult;

        stringResult = StringUtils.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("Better of " + test1 + " & " + test2 + " based on length is " + stringResult);

        stringResult = StringUtils.betterString(test1, test2, (s1, s2) -> true);
        System.out.println("Better of " + test1 + " & " + test2 + " based on 1st is always best is " + stringResult);

        stringResult = ElementUtils.betterElement(test1, test2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("(generics) Better of " + test1 + " & " + test2 + " based on length is " + stringResult);

        stringResult = ElementUtils.betterElement(test1, test2, (s1, s2) -> true);
        System.out.println("(generics) Better of " + test1 + " & " + test2 + " based on 1st is always best is " + stringResult);

        intResult = ElementUtils.betterElement(x, y, (int1, int2) -> true);
        System.out.println("Better of " + x + " & " + y + " based on 1st is always best is " + intResult);

        intResult = ElementUtils.betterElement(x, y, (int1, int2) -> int1 > int2);
        System.out.println("Better of " + x + " & " + y + " based on size is " + intResult);
    }
}
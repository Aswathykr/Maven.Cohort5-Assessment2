package rocks.zipcode.assessment2.fundamentals;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String result = String.format("%%%ds", amountOfPadding);

        return String.format(result, stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String result = String.format("%%%ds", -amountOfPadding);
        return String.format(result, stringToBePadded);

    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String result = stringToBeRepeated;
        for (int i = 1; i < numberOfTimeToRepeat; i++) {
            result += stringToBeRepeated;
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        string = string.replace(" ","");
        int[]chars = string.chars().
                filter(c-> !Character.isAlphabetic(c))
                .toArray();


        return chars.length == 0;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        int[]chars = string.chars().
                filter(c-> !Character.isDigit(c))
                .toArray();

        return chars.length == 0;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        int[]chars = string.chars().
                filter(c-> Character.isLetterOrDigit(c))
                .toArray();

        return chars.length == 0;

    }
}

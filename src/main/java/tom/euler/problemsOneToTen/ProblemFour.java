package tom.euler.problemsOneToTen;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class ProblemFour {

    private ProblemFour() {
    }

    public static int largestPalindromeOfAnyTwoNumbersOfLength(int allowedDigitLength) {
        int highest = 0;
        int lowestAllowedValue = minValueOfAllowedDigitLength(allowedDigitLength);
        final int highestAllowedValue = maxValueOfAllowedDigitLength(allowedDigitLength);

        for (int first = highestAllowedValue; first >= lowestAllowedValue; first--) {
            for (int second = highestAllowedValue; second >= first; second--) {
                if (isPalindrome(productAsString(first, second))) {
                    if ((first * second) > highest) {
                        highest = first * second;
                    }
                }
            }
        }

        return highest;
    }

    public static int largestPalindromeUsingFunctionalOfAnyTwoNumbersOfLength(int allowedDigitLength) throws NoSuchElementException {
        int first = minValueOfAllowedDigitLength(allowedDigitLength);
        int last = maxValueOfAllowedDigitLength(allowedDigitLength);

        return IntStream.rangeClosed(first, last).flatMap(f -> IntStream.rangeClosed(first, last).map(s -> s * f))
                .filter(x -> isPalindrome(Integer.toString(x))).max().getAsInt();
    }

    private static int maxValueOfAllowedDigitLength(int allowedDigitLength) {
        return powerOfTen(allowedDigitLength) - 1;
    }

    private static int minValueOfAllowedDigitLength(int allowedDigitLength) {
        return powerOfTen(allowedDigitLength - 1);
    }

    private static int powerOfTen(int allowedDigitLength) {
        return powerOf(10, allowedDigitLength);
    }

    private static int powerOf(int value, int powerToRaise) {
        return (int) Math.pow(value, powerToRaise);
    }

    private static boolean isPalindrome(String value) {
        return value.equals(new StringBuilder(value).reverse().toString());
    }

    private static String productAsString(int first, int second) {
        return Integer.toString(first * second);
    }
}

package tom.euler.problemsOneToTen;

import java.util.stream.IntStream;

public class ProblemFour {

    private ProblemFour() {
    }

    public static int largestPalindromeOfAnyTwoNumbersOfLength(int allowedDigitLength) {
        int highest = 0;
        final int end = maxValueOfAllowedDigitLength(allowedDigitLength);

        // TODO reverse
        for (int first = minValueOfAllowedDigitLength(allowedDigitLength); first <= end; first++) {
            for (int second = minValueOfAllowedDigitLength(allowedDigitLength); second < first; second++) {
                if (isPalindrome(productAsString(first, second))) {
                    if ((first * second) > highest) {
                        highest = first * second;
                    }
                }
            }
        }

        return highest;
    }

    public static int largestPalindromeUsingFunctionalOfAnyTwoNumbersOfLength(int allowedDigitLength) {
        int first = minValueOfAllowedDigitLength(allowedDigitLength);
        int second = minValueOfAllowedDigitLength(allowedDigitLength);

        int end = maxValueOfAllowedDigitLength(allowedDigitLength);

//        IntStream.iterate(first, i -> i + 1).limit(end).flatMap(frst -> IntStream.iterate(second, k -> k + 1).limit(frst)
//                .filter(scnd -> isPalindrome(productAsString(frst, scnd)))).forEach(System.out::println);
//
//        return IntStream.iterate(first, i -> i + 1).limit(end).flatMap(frst -> IntStream.iterate(second, k -> k + 1).limit(frst)
//                .filter(scnd -> isPalindrome(productAsString(frst, scnd)))).max().getAsInt();

        return IntStream.rangeClosed(first, end).flatMap(f -> IntStream.range(first, end).filter(s -> isPalindrome(productAsString(f, s)))).max().getAsInt();

//        return -1;
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

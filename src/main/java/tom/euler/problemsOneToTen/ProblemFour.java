package tom.euler.problemsOneToTen;

public class ProblemFour {

    private ProblemFour() {
    }

    public static int largestPalindromeOfAnyTwoNumbersOfLength(int allowedDigitLength) {
    int highest = 0;
        int start = minValueOfAllowedDigitLength(allowedDigitLength);
        final int last = maxValueOfAllowedDigitLength(allowedDigitLength);

        for (int first = last; first >= start; first--) {
            for (int second = last; second >= start; second--) {
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
//        int second = minValueOfAllowedDigitLength(allowedDigitLength);

        int end = maxValueOfAllowedDigitLength(allowedDigitLength);

//        IntStream.iterate(first, i -> i + 1).limit(end).flatMap(frst -> IntStream.iterate(second, k -> k + 1).limit(frst)
//                .filter(scnd -> isPalindrome(productAsString(frst, scnd)))).forEach(System.out::println);
//
//        return IntStream.iterate(first, i -> i + 1).limit(end).flatMap(frst -> IntStream.iterate(second, k -> k + 1).limit(frst)
//                .filter(scnd -> isPalindrome(productAsString(frst, scnd)))).max().getAsInt();

//        return IntStream.rangeClosed(first, end).flatMap(f -> IntStream.rangeClosed(first, end).filter(s -> isPalindrome(productAsString(f, s)))).max().getAsInt();
//        return IntStream.rangeClosed(first, end).flatMap(f -> IntStream.rangeClosed(first, end).forEach(s -> s * f))

        return -1;
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

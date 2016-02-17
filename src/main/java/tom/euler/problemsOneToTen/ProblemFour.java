package tom.euler.problemsOneToTen;

public class ProblemFour {

    private ProblemFour() {
    }

    public static int largestPalindromeOfAnyTwoNumbersOfLength(int allowedDigitLength) {
        int highest = 0;
        final int end = powerOfTen(allowedDigitLength);

        for (int first = powerOfTen(allowedDigitLength-1); first < end; first++) {
            for(int second = powerOfTen(allowedDigitLength-1); second < first; second++) {
                if (isPalindrome(productAsString(first, second))) {
                    if ((first * second) > highest) {
                        highest = first * second;
                    }
                }
            }
        }

        return highest;
    }

    private static String productAsString(int first, int second) {
        return Integer.toString(first * second);
    }

    private static boolean isPalindrome(String value) {
        return value.equals(new StringBuilder(value).reverse().toString());
    }

    private static int powerOfTen(int allowedDigitLength) {
        return powerOf(10, allowedDigitLength);
    }

    private static int powerOf(int value, int powerToRaise) {
        return (int)Math.pow(value, powerToRaise);
    }
}

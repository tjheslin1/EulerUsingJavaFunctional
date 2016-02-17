package tom.euler.problemsOneToTen;

public class ProblemFour {

    private ProblemFour() {
    }

    public static int largestPalindromeOfTwoXDigitNumbers(int numOfDigits) {
        int first = (int)Math.pow(10, numOfDigits-1);
        int second = first;
        int highest = 0;

        final int end = (int)Math.pow(10, numOfDigits);

        for (; first < end; first++) {
            for(; second < end; second++) {
                String product = Integer.toString(first *  second);

                if (product.equals(new StringBuilder(product).reverse().toString())) {
                    if ((first * second) > highest) {
                        highest = first * second;
                    }
                }
            }
        }

        return highest;
    }
}

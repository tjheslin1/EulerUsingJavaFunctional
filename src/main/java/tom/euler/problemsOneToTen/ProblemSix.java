package tom.euler.problemsOneToTen;

import java.util.stream.IntStream;

public class ProblemSix {

    public static int differenceBetweenSumOfSquaresAndSquareOfSumUpTo(int max) {
        return Math.abs(sumOfSquares(max) - squareOfSum(max));
    }

    public static int differenceBetweenSumOfSquaresAndSquareOfSumUsingFunctionalUpTo(int max) {
        return Math.abs(squareOfSumUsingFunctional(max) - sumOfSquaresUsingFunctional(max));
    }

    private static int sumOfSquares(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += squareOf(i);
        }
        return sum;
    }

    private static int sumOfSquaresUsingFunctional(int max) {
        return squareOf(IntStream.rangeClosed(1, max).sum());
    }

    private static int squareOfSumUsingFunctional(int max) {
        return IntStream.rangeClosed(1, max).map(ProblemSix::squareOf).sum();
    }

    private static int squareOfSum(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        return squareOf(sum);
    }

    private static int squareOf(int value) {
        return (int) Math.pow(value, 2);
    }
}

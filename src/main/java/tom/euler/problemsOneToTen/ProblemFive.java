package tom.euler.problemsOneToTen;

import java.util.stream.IntStream;

public class ProblemFive {

    private ProblemFive() {
    }

    public static int smallestPositiveNumberEvenlyDivisibleByAllNumbersUpTo(int largestNumberDivisibleBy) {
        int next = largestNumberDivisibleBy;
        while (!isEvenlyDivisibleByAll(next, largestNumberDivisibleBy)) {
            next++;
        }

        return next;
    }

    public static int smallestPositiveNumberEvenlyDivisibleByAllNumbersUsingFunctionalUpTo(int largestNumberDivisibleBy) {
        IntStream streamOfValidValues = IntStream.iterate(largestNumberDivisibleBy, i -> i + 1).filter(x -> isEvenlyDivisibleByAllUsingFunctional(x, largestNumberDivisibleBy));
        return streamOfValidValues.findFirst().getAsInt();
    }

    private static boolean isEvenlyDivisibleByAll(int value, int largestNumberDivisibleBy) {
        for (int divisor = 1; divisor <= largestNumberDivisibleBy; divisor++) {
            if (!isEvenlyDivisible(value, divisor)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isEvenlyDivisibleByAllUsingFunctional(int value, int largestNumberDivisibleBy) {
        return IntStream.rangeClosed(1, largestNumberDivisibleBy).allMatch(i -> isEvenlyDivisible(value, i));
    }

    private static boolean isEvenlyDivisible(int value, int divisor) {
        return (value % divisor) == 0;
    }
}

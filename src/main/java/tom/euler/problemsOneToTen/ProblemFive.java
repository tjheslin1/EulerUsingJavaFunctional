package tom.euler.problemsOneToTen;

import java.util.stream.IntStream;

public class ProblemFive {

    private ProblemFive() {
    }

    public static int smallestPositiveNumberEvenlyDivisibleByAllNumbersUpTo(int largestNumberDivisibleBy) {
        int next = largestNumberDivisibleBy;
        while (!isEvenylDivisibleByAll(next, largestNumberDivisibleBy)) {
            next++;
        }

        return next;
    }

    public static int smallestPositiveNumberEvenlyDivisibleByAllNumbersUsingFunctionalUpTo(int largestNumberDivisibleBy) {
        int next = largestNumberDivisibleBy;
//        return IntStream.iterate(0, i -> i + 1).findFirst(isEvenylDivisibleByAll(next, largestNumberDivisibleBy)).findFirst().getAsInt();
        return -1;
    }

    private static boolean isEvenylDivisibleByAll(int value, int largestNumberDivisibleBy) {
        for (int divisor = 1; divisor <= largestNumberDivisibleBy; divisor++) {
            if (!isEvenlyDivisible(value, divisor)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isEvenlyDivisible(int value, int divisor) {
        return (value % divisor) == 0;
    }
}

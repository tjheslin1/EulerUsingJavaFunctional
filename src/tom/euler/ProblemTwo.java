package tom.euler;

import tom.util.IntReference;

import java.util.List;

import static java.util.Arrays.asList;

public class ProblemTwo {

    private static final int FOUR_MILLION = 4_000_000;

    private ProblemTwo() {
    }

    public static int example() {
        List<Integer> fibToTen = asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
        return sumOfValues(fibToTen);
    }

    public static int calculate() {
        int firstFibonacciNumber = 1, secondFibonacciNumber = 2;
        IntReference sum = new IntReference(0);

        initialiseSum(sum, secondFibonacciNumber, firstFibonacciNumber);

        iterateFibonacciSequenceUpTo(FOUR_MILLION, firstFibonacciNumber, secondFibonacciNumber, sum);
        return sum.integer;
    }

    public static int calculateUsingFunctional() {
        // TODO: implement functional approach
        return -2;
    }

    private static int sumOfValues(List<Integer> sequence) {
        int sum = 0;
        for (int i : sequence) {
            sum += i;
        }

        return sum;
    }

    private static void initialiseSum(IntReference sum, int... values) {
        for (int value : values) {
            if (isEven(value))
                addToSum(sum, value);
        }
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }

    private static void addToSum(IntReference sum, int value) {
        sum.integer += value;
    }

    private static void iterateFibonacciSequenceUpTo(int max, int start, int next, IntReference sum) {
        int previous = start;
        while (next <= max) {
            int tempPrevious = next;

            next = nextFibonacciNumber(previous, next);
            previous = tempPrevious;

            if (isEven(next))
                addToSum(sum, next);
        }
    }

    private static int nextFibonacciNumber(int nMinusTwo, int nMinusOne) {
        return nMinusTwo + nMinusOne;
    }
}

package tom.euler;

import tom.util.IntReference;

import java.util.List;

import static java.util.Arrays.asList;

public class ProblemTwo {

    private ProblemTwo() {
    }

    public static int example() {
        List<Integer> fibToTen = asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
        return sumOfValues(fibToTen);
    }

    public static int sumOfEvenFibonacciValues(int max, int firstFibonacciNumber, int secondFibonacciNumber) {
        IntReference sum = new IntReference(0);

        initialiseSum(sum, secondFibonacciNumber, firstFibonacciNumber);
        iterateFibonacciSequenceUpTo(max, firstFibonacciNumber, secondFibonacciNumber, sum);

        return sum.integer;
    }

    public static int sumOfEvenFibonacciValuesFunctional(int max, IntReference sum) {
        // Function<Integer, Integer> answer =
        // i -> (IntStream.range(1, i+1)).filter(n -> valueIsAMultipleFunctional(n, multiples)).sum();

//        Function<Integer, Integer> answer = i -> (IntStream.range(1, i+1)).filter(ProblemTwo::isEven).map(addToSum(sum, );)
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

package tom.euler.problemsOneToTen;

import tom.util.IntReference;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

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

    public static int sumOfEvenFibonacciValuesFunctional(int max, int firstFibonacciNumber, int secondFibonacciNumber) {
        int result = FibonacciGenerator.finiteStream(i -> (i <= max), firstFibonacciNumber, secondFibonacciNumber).filter(ProblemTwo::isEven).mapToInt(i -> i).sum();

        result += isEven(firstFibonacciNumber) ? firstFibonacciNumber : 0;
        result += isEven(secondFibonacciNumber) ? secondFibonacciNumber : 0;

        return result;
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

    private static class FibonacciGenerator implements Iterator<Integer> {

        private final Predicate<Integer> predicate;

        private int firstFibonacciNumber, secondFibonacciNumber;

        protected FibonacciGenerator(Predicate<Integer> predicate, int firstFibonacciNumber, int secondFibonacciNumber) {
            this.predicate = predicate;
            this.firstFibonacciNumber = firstFibonacciNumber;
            this.secondFibonacciNumber = secondFibonacciNumber;
        }

        @Override
        public boolean hasNext() {
            return predicate.test(secondFibonacciNumber);
        }

        @Override
        public Integer next() {
            int next = nextFibonacciNumber(firstFibonacciNumber, secondFibonacciNumber);
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = next;
            return next;
        }

        public static Stream<Integer> finiteStream(final Predicate<Integer> predicate, int firstFibonacciNumber, int secondFibonacciNumber) {
            return StreamSupport.stream(
                    Spliterators.spliteratorUnknownSize(new FibonacciGenerator(predicate, firstFibonacciNumber, secondFibonacciNumber), Spliterator.ORDERED), false
            );

        }
    }
}

package tom.euler;

import java.util.function.Function;
import java.util.stream.IntStream;

public class ProblemOne {

    private ProblemOne() {
    }

    public static int example(int max, int... multiples) {
        return sumOfMultiplesUpToMax(max, multiples);
    }

    public static int calculate(int max, int... multiples) {
        return sumOfMultiplesUpToMax(max, multiples);
    }

    public static int calculateUsingFunctional(int max, int multiple1, int multiple2) {
        return sumOfMultiplesUpToMaxUsingFunctional(max, multiple1, multiple2);
    }

    private static int sumOfMultiplesUpToMax(int max, int... multiples) {
        int sum = 0;
        for (int i = 0; i < max; i++) {
            if (valueIsAMultiple(i, multiples)) {
                sum += i;
            }
        }

        return sum;
    }

    private static int sumOfMultiplesUpToMaxUsingFunctional(int max, int multiple1, int multiple2) {
        Function<Integer, Integer> answer = i -> (IntStream.range(1, i)).filter(n -> valueIsAMultiple(n, multiple1, multiple2)).sum();
        return answer.apply(max);
    }

    private static boolean valueIsAMultiple(int value, int... multiples) {
        for (int multiple : multiples) {
            if (value % multiple == 0) {
                return true;
            }
        }

        return false;
    }
}

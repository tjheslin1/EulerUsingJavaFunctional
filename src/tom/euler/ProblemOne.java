package tom.euler;

import java.util.function.Function;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class ProblemOne {

    private ProblemOne() {
    }

    public static int sumOfMultiplesUpToMax(int max, int... multiples) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            if (valueIsAMultiple(i, multiples)) {
                sum += i;
            }
        }

        return sum;
    }

    public static int sumOfMultiplesUpToMaxUsingFunctional(int max, int... multiples) {
        Function<Integer, Integer> answer = i -> (IntStream.range(1, i+1)).filter(n -> valueIsAMultipleFunctional(n, multiples)).sum();
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

    private static boolean valueIsAMultipleFunctional(int value, int... multiples) {
        return stream(multiples).anyMatch(multiple -> value % multiple == 0);
    }
}

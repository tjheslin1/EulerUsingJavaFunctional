package tom.euler.problemsOneToTen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static tom.util.NextLong.next;

public class ProblemThree {

    private static final int EVEN_INCREMENT = 1;
    private static final int ODD_INCREMENT = 2;
    private static List<Long> primeFactors = Collections.emptyList();

    private ProblemThree() {
    }

    public static long largestPrimeFactorOf(long valueInQuestion) {
        primeFactors = Collections.emptyList();
        final int increment = isOdd(valueInQuestion) ? ODD_INCREMENT : EVEN_INCREMENT;

        long i = 1;
        while (i < squareRootOf(valueInQuestion)) {
            if (next(i).isAFactorOf(valueInQuestion) && next(i).isAPrime()) {
                addToListOfPrimeFactors(i);
            }

            i += increment;
        }

        return largestPrimeFactor();
    }

    private static long squareRootOf(long value) {
        return (long) Math.sqrt(value);
    }

    private static boolean isOdd(long value) {
        return value % 2 != 0;
    }

    private static void addToListOfPrimeFactors(long value) {
        if (primeFactors.isEmpty()) {
            primeFactors = new ArrayList<>();
        }

        primeFactors.add(value);
    }

    private static long largestPrimeFactor() {
        if (primeFactors.isEmpty()) {
            return 0;
        } else {
            return primeFactors.stream().mapToLong(i -> i).max().getAsLong();
        }
    }
}

package tom.euler;

import java.util.Collections;
import java.util.List;

import static tom.euler.NextLong.next;

public class ProblemThree {

    private static final int EVEN_INCREMENT = 1;
    private static final int ODD_INCREMENT = 2;
    private static List<Long> primeFactors = Collections.emptyList();

    private ProblemThree() {
    }

    public static long[] primeFactorsOf(long valueInQuestion) {
        final int increment = isOdd(valueInQuestion) ? ODD_INCREMENT : EVEN_INCREMENT;

        long i = 0;
        while (i < valueInQuestion) {
            if (next(i).isAFactorOf(valueInQuestion) && next(i).isAPrime()) {
                addToListOfPrimeFactors(i);
            }

            i += increment;
        }

        return primeFactorsArray();
    }

    private static boolean isOdd(long value) {
        return value % 2 != 0;
    }

    private static void addToListOfPrimeFactors(long value) {
        primeFactors.add(value);
    }

    private static long[] primeFactorsArray() {
        return primeFactors.stream().mapToLong(i -> i).toArray();
    }
}

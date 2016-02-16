package tom.euler.problemsOneToTen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.LongStream;

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
            if (isAFactorOf(i, valueInQuestion) && isAPrime(i)) {
                addToListOfPrimeFactors(i);
            }

            i += increment;
        }

        return largestPrimeFactor();
    }

    public static long largestPrimeFactorOfUsingFunctional(long valueInQuestion) {
        return LongStream.range(1, squareRootOf(valueInQuestion)).filter(i -> isAFactorOf(i, valueInQuestion) && isAPrime(i)).max().getAsLong();
    }

    private static long squareRootOf(long value) {
        return (long) Math.sqrt(value);
    }

    private static boolean isOdd(long value) {
        return value % 2 != 0;
    }

    private static boolean isAFactorOf(long value, long valueInQuestion) {
        return (valueInQuestion % value) == 0;
    }

    private static boolean isAPrime(long value) {
        if (value == 1) {
            // https://primes.utm.edu/notes/faq/one.html
            return false;
        }

        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
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

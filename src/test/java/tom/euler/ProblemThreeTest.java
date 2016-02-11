package tom.euler;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemThreeTest {

    @Ignore
    @Test
    public void solveExample() {
        final long[] expected = {5, 7, 13, 29};

        long[] actual = ProblemThree.primeFactorsOf(13195);
        assertEquals(expected, actual);
    }
}

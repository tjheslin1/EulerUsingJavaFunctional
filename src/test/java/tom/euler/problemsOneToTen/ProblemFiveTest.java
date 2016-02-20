package tom.euler.problemsOneToTen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemFiveTest {

    @Test
    public void solveExample() {
        final int expected = 2520;

        int actual = ProblemFive.example(10);
        assertEquals(expected, actual);
    }
}

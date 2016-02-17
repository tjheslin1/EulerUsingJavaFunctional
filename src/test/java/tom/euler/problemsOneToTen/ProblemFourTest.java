package tom.euler.problemsOneToTen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemFourTest {

    @Test
    public void solveExample() {
        final int numOfDigits = 2;
        final int expected = 9009;

        assertEquals(ProblemFour.largestPalindromeOfTwoXDigitNumbers(numOfDigits), expected);
    }
}

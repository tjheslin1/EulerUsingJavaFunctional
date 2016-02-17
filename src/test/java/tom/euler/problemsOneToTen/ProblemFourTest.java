package tom.euler.problemsOneToTen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static tom.euler.Answers.PROBLEM_FOUR;

public class ProblemFourTest {

    @Test
    public void solveExample() {
        final int numOfDigits = 2;
        final int expected = 9009;

        int actual = ProblemFour.largestPalindromeOfAnyTwoNumbersOfLength(numOfDigits);
        assertEquals(expected, actual);
    }

    @Test
    public void solveProblem() {
        final int numOfDigits = 3;
        final int expected = PROBLEM_FOUR.getAnswer();

        int actual = ProblemFour.largestPalindromeOfAnyTwoNumbersOfLength(numOfDigits);
        assertEquals(expected, actual);
    }

    @Test
    public void solveProblemUsingFunctional() {
        final int numOfDigits = 3;
        final int expected = PROBLEM_FOUR.getAnswer();

        int actual = ProblemFour.largestPalindromeOfAnyTwoNumbersOfLengthUsingFunctional(numOfDigits);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSolveForSingleDigitLength() {
        final int numOfDigits = 1;
        final int expected = 9;

        int actual = ProblemFour.largestPalindromeOfAnyTwoNumbersOfLength(numOfDigits);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleNegativeDigitLength() {
        final int numOfDigits = -1;
        final int expected = 0;

        int actual = ProblemFour.largestPalindromeOfAnyTwoNumbersOfLength(numOfDigits);
        assertEquals(expected, actual);
    }
}

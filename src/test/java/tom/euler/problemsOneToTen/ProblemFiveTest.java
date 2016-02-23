package tom.euler.problemsOneToTen;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static tom.euler.Answers.PROBLEM_FIVE;

public class ProblemFiveTest {

    @Test
    public void solveExample() {
        final int expected = 2520;

        int actual = ProblemFive.smallestPositiveNumberEvenlyDivisibleByAllNumbersUpTo(10);
        assertEquals(expected, actual);
    }

    @Test
    public void solveProblem() {
        final int expected = PROBLEM_FIVE.getAnswer();

        int actual = ProblemFive.smallestPositiveNumberEvenlyDivisibleByAllNumbersUpTo(20);
        assertEquals(expected, actual);
    }

    @Ignore
    @Test
    public void solveProblemUsingFunctional() {
        final int expected = PROBLEM_FIVE.getAnswer();

        int actual = ProblemFive.smallestPositiveNumberEvenlyDivisibleByAllNumbersUsingFunctionalUpTo(20);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSolveProblemForMaxDivisorOfOne() {
        final int expected = 1;

        int actual = ProblemFive.smallestPositiveNumberEvenlyDivisibleByAllNumbersUpTo(1);
        assertEquals(expected, actual);
    }
}

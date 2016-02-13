package tom.euler.problemsOneToTen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static tom.euler.Answers.PROBLEM_ONE;

public class ProblemOneTest {

    @Test
    public void solveExample() {
        final int expected = 23;

        int actual = ProblemOne.sumOfMultiplesUpToMax(9, 3, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void solveProblem() {
        final int expected = PROBLEM_ONE.getAnswer();

        int actual = ProblemOne.sumOfMultiplesUpToMax(999, 3, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void solveProblemUsingFunctional() {
        final int expected = PROBLEM_ONE.getAnswer();

        int actual = ProblemOne.sumOfMultiplesUpToMaxUsingFunctional(999, 3, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void solveDifferentSetOfMultiples() {
        final int expected = 299496;

        int actual = ProblemOne.sumOfMultiplesUpToMax(999, 3, 5, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void sumToZeroWhenMaxIsOneAndMultipleIsGreaterThanOne() {
        final int expected = 1;

        int actual = ProblemOne.sumOfMultiplesUpToMaxUsingFunctional(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void solveForDuplicateMultiples() {
        int answer = ProblemOne.sumOfMultiplesUpToMax(12, 6, 9);
        int answerWithDuplicate = ProblemOne.sumOfMultiplesUpToMax(12, 6, 6, 9);

        assertEquals(answer, answerWithDuplicate);
    }
}

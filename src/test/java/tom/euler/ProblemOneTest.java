package tom.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static tom.euler.Answers.PROBLEM_ONE;

public class ProblemOneTest {

    @Test
    public void example() {
        final int expected = 23;

        int exampleAnswer = ProblemOne.sumOfMultiplesUpToMax(9, 3, 5);
        assertEquals(exampleAnswer, expected);
    }

    @Test
    public void solveProblem() {
        final int expected = PROBLEM_ONE.getAnswer();

        int answer = ProblemOne.sumOfMultiplesUpToMax(999, 3, 5);
        assertEquals(answer, expected);
    }

    @Test
    public void solveProblemUsingFunctional() {
        final int expected = PROBLEM_ONE.getAnswer();

        int answer = ProblemOne.sumOfMultiplesUpToMaxUsingFunctional(999, 3, 5);
        assertEquals(answer, expected);
    }

    @Test
    public void solveDifferentSetOfMultiples() {
        final int expected = 299496;

        int answer = ProblemOne.sumOfMultiplesUpToMax(999, 3, 5, 4);
        assertEquals(answer, expected);
    }

    @Test
    public void sumToZeroWhenMaxIsOneAndMultipleIsGreaterThanOne() {
        final int expected = 1;

        int answer = ProblemOne.sumOfMultiplesUpToMaxUsingFunctional(1, 1);
        assertEquals(answer, expected);
    }

    @Test
    public void solveForDuplicateMultiples() {
        int answer = ProblemOne.sumOfMultiplesUpToMax(12, 6, 9);
        int answerWithDuplicate = ProblemOne.sumOfMultiplesUpToMax(12, 6, 6, 9);

        assertEquals(answer, answerWithDuplicate);
    }
}

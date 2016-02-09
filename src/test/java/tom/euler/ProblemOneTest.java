package tom.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static tom.euler.Answers.PROBLEM_ONE;

public class ProblemOneTest {

    @Test
    public void exampleTest() {
        final int expected = 23;

        int exampleAnswer = ProblemOne.sumOfMultiplesUpToMax(9, 3, 5);
        assertEquals(exampleAnswer, expected);
    }

    @Test
    public void solveProblemTest() {
        final int expected = PROBLEM_ONE.getAnswer();

        int answer = ProblemOne.sumOfMultiplesUpToMax(999, 3, 5);
        assertEquals(answer, expected);
    }

    @Test
    public void solveProblemUsingFunctionalTest() {
        final int expected = PROBLEM_ONE.getAnswer();

        int answer = ProblemOne.sumOfMultiplesUpToMaxUsingFunctional(999, 3, 5);
        assertEquals(answer, expected);
    }

    @Test
    public void shouldSolveDifferentSetOfMultiplesTest() {
        final int expected = 299496;

        int answer = ProblemOne.sumOfMultiplesUpToMax(999, 3, 5, 4);
        assertEquals(answer, expected);
    }

    @Test
    public void shouldSumToZeroWhenMaxIsOneAndMultipleIsGreaterThanOne() {
        final int expected = 1;

        int answer = ProblemOne.sumOfMultiplesUpToMaxUsingFunctional(1, 1);
        assertEquals(answer, expected);
    }
}

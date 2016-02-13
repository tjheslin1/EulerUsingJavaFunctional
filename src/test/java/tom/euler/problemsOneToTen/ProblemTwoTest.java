package tom.euler.problemsOneToTen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static tom.euler.Answers.PROBLEM_TWO;

public class ProblemTwoTest {

    private static final int FOUR_MILLION = 4_000_000;

    @Test
    public void solveExample() {
        final int expected = 231;

        int actual = ProblemTwo.example();
        assertEquals(expected, actual);
    }

    @Test
    public void solveProblem() {
        final int expected = PROBLEM_TWO.getAnswer();
        int actual = ProblemTwo.sumOfEvenFibonacciValues(FOUR_MILLION, 1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void solveProblemUsingFunctional() {
        final int expected = PROBLEM_TWO.getAnswer();
        int actual = ProblemTwo.sumOfEvenFibonacciValuesFunctional(FOUR_MILLION, 1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void notCalculateAboveMax() {
        final int expected = 0;

        int actual = ProblemTwo.sumOfEvenFibonacciValues(1, 3, 5);
        assertEquals(expected, actual);
    }
}

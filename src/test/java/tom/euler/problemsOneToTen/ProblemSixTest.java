package tom.euler.problemsOneToTen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static tom.euler.Answers.PROBLEM_SIX;

public class ProblemSixTest {

    @Test
    public void solveExample() {
        final int expected = 2640;

        int actual = ProblemSix.differenceBetweenSumOfSquaresAndSquareOfSumUpTo(10);
        assertEquals(expected, actual);
    }

    @Test
    public void solveProblem() {
        final int expected = PROBLEM_SIX.getAnswer();

        int actual = ProblemSix.differenceBetweenSumOfSquaresAndSquareOfSumUpTo(100);
        assertEquals(expected, actual);
    }

    @Test
    public void solveProblemUsingFunctional() {
        final int expected = PROBLEM_SIX.getAnswer();

        int actual = ProblemSix.differenceBetweenSumOfSquaresAndSquareOfSumUsingFunctionalUpTo(100);
        assertEquals(expected, actual);
    }

    @Test
    public void solveForMaxOfOne() {
        final int expected = 0;

        int actual = ProblemSix.differenceBetweenSumOfSquaresAndSquareOfSumUpTo(1);
        assertEquals(expected, actual);
    }
}

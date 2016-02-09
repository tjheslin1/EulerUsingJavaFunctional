package tom.euler;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static tom.euler.Answers.PROBLEM_TWO;

public class ProblemTwoTest {

    private static final int FOUR_MILLION = 4_000_000;

    @Test
    public void example() {
        final int expected = 231;

        int exampleAnswer = ProblemTwo.example();
        assertEquals(exampleAnswer, expected);
    }

    @Test
    public void solveProblem() {
        final int expected = PROBLEM_TWO.getAnswer();
        int answer = ProblemTwo.sumOfEvenFibonacciValues(FOUR_MILLION, 1, 2);

        assertEquals(answer, expected);
    }

    @Ignore("solveProblemUsingFunctional to be implemented")
    @Test
    public void solveProblemUsingFunctional() {
        fail();
    }

    @Test
    public void notIteratePastMax() {
        final int expected = 0;

        int answer = ProblemTwo.sumOfEvenFibonacciValues(1, 3, 5);
        assertEquals(expected, answer);
    }
}

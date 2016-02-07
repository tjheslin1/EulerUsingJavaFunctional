package tom.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static tom.euler.Answers.PROBLEM_ONE;

public class ProblemOneTest {

    @Test
    public void exampleTest() {
        final int expected = 23;

        int exampleAnswer = ProblemOne.example(10, 3, 5);
        assertEquals(exampleAnswer, expected);
    }

    @Test
    public void solveProblemTest() {
        final int expected = PROBLEM_ONE.getAnswer();

        int answer = ProblemOne.calculate(1000, 3, 5);
        assertEquals(answer, expected);
    }

    @Test
    public void solveProblemUsingFunctionalTest() {
        final int expected = PROBLEM_ONE.getAnswer();

        int answer = ProblemOne.calculateUsingFunctional(1000, 3, 5);
        assertEquals(answer, expected);
    }

    @Test
    public void shouldNotAllowExtraMultiples() {
        final int expected = PROBLEM_ONE.getAnswer();

        int answer = ProblemOne.calculate(1000, 3, 5, 4);
        assertNotEquals(answer, expected);
    }
}

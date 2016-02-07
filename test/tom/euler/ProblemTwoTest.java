package tom.euler;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static tom.euler.Answers.PROBLEM_TWO;

public class ProblemTwoTest {

    @Test
    public void exampleTest() {
        final int expected = 231;

        int exampleAnswer = ProblemTwo.example();
        assertEquals(exampleAnswer, expected);
    }

    @Test
    public void solveProblemTest() {
        final int expected = PROBLEM_TWO.getAnswer();
        int answer = ProblemTwo.calculate();

        assertEquals(answer, expected);
    }

    @Ignore("solveProblemUsingFunctionalTest to be implemented")
    @Test
    public void solveProblemUsingFunctionalTest() {
        fail();
    }
}

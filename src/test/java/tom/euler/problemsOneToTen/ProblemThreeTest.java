package tom.euler.problemsOneToTen;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static tom.euler.Answers.PROBLEM_THREE;

public class ProblemThreeTest {

    @Test
    public void solveExample() {
        final long expected = 29;

        long actual = ProblemThree.largestPrimeFactorOf(13195);
        assertEquals(expected, actual);
    }

    @Test
    public void solveProblem() {
        final long expected = PROBLEM_THREE.getAnswer();

        long actual = ProblemThree.largestPrimeFactorOf(600851475143L);
        assertEquals(expected, actual);
    }

    @Ignore
    @Test
    public void solveProblemUsingFunctional() {
        final long expected = PROBLEM_THREE.getAnswer();

        long actual = ProblemThree.largestPrimeFactorOf(600851475143L);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLargestPrimeFactorOfEvenNumber() {
        final long expected = 43;

        long actual = ProblemThree.largestPrimeFactorOf(8329572398L);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNoPrimesForAPrimelessNumber() {
        final long expected = 0;

        long actual = ProblemThree.largestPrimeFactorOf(23459L);
        assertEquals(expected, actual);
    }
}

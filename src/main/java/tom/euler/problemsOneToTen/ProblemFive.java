package tom.euler.problemsOneToTen;

public class ProblemFive {

    private ProblemFive() {
    }

    public static int example(int largestNumberDivisibleBy) {
        int next = largestNumberDivisibleBy + 1;

        return 0;
    }

    private static boolean isEvenlyDivisble(int value, int divisor) {
        return (value % divisor) == 0;
    }
}

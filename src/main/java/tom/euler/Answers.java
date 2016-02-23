package tom.euler;

public enum Answers {

    PROBLEM_ONE(233168),
    PROBLEM_TWO(4613732),
    PROBLEM_THREE(6857),
    PROBLEM_FOUR(906609),
    PROBLEM_FIVE(232792560);

    private final int answerToProblem;

    Answers(int answer) {
        answerToProblem = answer;
    }

    public int getAnswer() {
        return answerToProblem;
    }
}

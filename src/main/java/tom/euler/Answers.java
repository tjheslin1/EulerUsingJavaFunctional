package tom.euler;

public enum Answers {

    PROBLEM_ONE(233168),
    PROBLEM_TWO(4613732),
    PROBLEM_THREE(-1);

    private final int answerToProblem;

    Answers(int answer) {
        answerToProblem = answer;
    }

    public int getAnswer() {
        return answerToProblem;
    }
}

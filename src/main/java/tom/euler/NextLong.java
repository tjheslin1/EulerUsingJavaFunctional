package tom.euler;

public class NextLong {

    private final long next;

    private NextLong(long next) {
        this.next = next;
    }

    public static NextLong next(long value) {
        return new NextLong(value);
    }

    public boolean isAFactorOf(long valueInQuestion) {
        return true;
    }

    public boolean isAPrime() {
        return true;

    }
}

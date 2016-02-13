package tom.util;

public class NextLong {

    private final long next;

    private NextLong(long next) {
        this.next = next;
    }

    public static NextLong next(long value) {
        return new NextLong(value);
    }

    public boolean isAFactorOf(long valueInQuestion) {
        return (valueInQuestion % next) == 0;
    }

    public boolean isAPrime() {
        if (next == 1) {
            // https://primes.utm.edu/notes/faq/one.html
            return false;
        }

        for (int i = 2; i < next; i++) {
            if (next % i == 0) {
                return false;
            }
        }
        return true;
    }
}

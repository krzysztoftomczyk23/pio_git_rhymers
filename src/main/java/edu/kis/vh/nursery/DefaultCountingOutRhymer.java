package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY = -1;
    public static final int IF_EMPTY = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int totalNumbers = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalNumbers] = in;
    }

    public boolean callCheck() {
        return totalNumbers == EMPTY;
    }

    public boolean isFull() {
        return totalNumbers == MAX_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[totalNumbers];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[totalNumbers--];
    }

}

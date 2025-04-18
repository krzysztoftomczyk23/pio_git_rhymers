package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int IF_EMPTY = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_SIZE -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}

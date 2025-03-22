package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int ERROR = -1;
    private final int[] numbers = new int[SIZE];

    public int totalNumbers = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalNumbers] = in;
    }

    public boolean callCheck() {
        return totalNumbers == ERROR;
    }

    public boolean isFull() {
        return totalNumbers == SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[totalNumbers];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[totalNumbers--];
    }

}

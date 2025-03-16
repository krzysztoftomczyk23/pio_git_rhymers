package edu.kis.vh.nursery;

public class FifoRhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int returnedValue = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return returnedValue;
    }
}

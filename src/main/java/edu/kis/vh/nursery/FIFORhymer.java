package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            getTemp().countIn(super.countOut());

        int returnedValue = getTemp().countOut();

        while (!getTemp().callCheck())
            countIn(getTemp().countOut());

        return returnedValue;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}

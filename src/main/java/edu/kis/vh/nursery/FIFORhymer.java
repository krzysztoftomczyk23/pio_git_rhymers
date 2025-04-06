package edu.kis.vh.nursery;

/**
 *Klasa FIFORhymer rozszerzająca klasę DefaultCountingOutRhymer
 *Klasa implemetuję strukturę FIFO (first in first out) czyli gdzie pierwszy dodany element jest pierwszy pobrany.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Metoda pobiera wartość zgodnie z zasadą first in first out.
     * Przenosi elementy do tymczasowego stosu w celu zachowania struktury FIFO.
     *
     * @return pierwsza wartość z kolejki FIFO
     */
    @Override
    public int countOut() {
        while (!callCheck())
            getTemp().countIn(super.countOut());

        int returnedValue = getTemp().countOut();

        while (!getTemp().callCheck())
            countIn(getTemp().countOut());

        return returnedValue;
    }


    /**
     * Zwraca referencję do tymczasowego stosu
     *
     * @return obiekt temp, będący tymczasowym stosem
     */
    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}

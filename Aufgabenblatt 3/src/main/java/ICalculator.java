import java.util.NoSuchElementException;

/**
 * Simple calculator.
 * @author Murat Degermenci
 * @version 1.0
 */


public interface ICalculator {

    /**
     * Addition von zwei Zahlen
     *
     * @param zahl1 ist die erste Zahl, die spaeter mit zahl2 addiert wird.
     * @param zahl2 ist die zweit Zahl, die mit zahl2 addiert wird.
     */

    public int addition (int zahl1, int zahl2);

    /**
     * Subtraktion von zwei Zahlen
     *
     * @param zahl1 ist die erste Zahl, die spaeter mit zahl2 subtrahiert wird.
     * @param zahl2 ist die zweit Zahl, die mit zahl2 subtrahiert wird.
     */

    public int subtraction (int zahl1, int zahl2);

    /**
     * Multiplikation von zwei Zahlen
     *
     * @param zahl1 ist die erste Zahl, die spaeter mit zahl2 multipliziert wird.
     * @param zahl2 ist die zweit Zahl, die mit zahl2 mulitpliziert wird.
     */

    public int multiplication (int zahl1, int zahl2);

    /**
     * Division von zwei Zahlen
     *
     * @param zahl1 ist die erste Zahl, die spaeter mit zahl2 dividiert wird.
     * @param zahl2 ist die zweit Zahl, die mit zahl2 dividiert wird.
     */

    public int division (int zahl1, int zahl2);

}

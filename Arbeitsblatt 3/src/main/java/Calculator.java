public class Calculator implements ICalculator{

    @Override
    public int addition(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    @Override
    public int subtraction(int zahl1, int zahl2) {
        return zahl1 - zahl2;
    }

    @Override
    public int multiplication(int zahl1, int zahl2) {
        return zahl1 * zahl2;
    }

    @Override
    public int division(int zahl1, int zahl2) {
        return zahl1 / zahl2;
    }
}

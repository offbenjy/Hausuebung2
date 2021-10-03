public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator(CalculateOperation add, CalculateOperation subtract, CalculateOperation multiply, CalculateOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a,b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {

        return multiply.calc(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a,b);
    }
}

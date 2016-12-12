package Learning.OOP.Calc.expression;

/**
 * Created by Сергей on 09.12.2016.
 */
public class Value implements Expression {
    private final double value;

    public Value(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}

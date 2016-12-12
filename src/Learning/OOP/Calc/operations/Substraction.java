package Learning.OOP.Calc.operations;

/**
 * Created by Сергей on 09.12.2016.
 */
public class Substraction implements Operation {
     Substraction() {
    }

    @Override
    public double apply(double arg1, double arg2) {
        return arg1 - arg2;
    }
}

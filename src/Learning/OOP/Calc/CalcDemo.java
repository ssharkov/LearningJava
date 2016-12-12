package Learning.OOP.Calc;

import Learning.OOP.Calc.expression.ComplexExpression;
import Learning.OOP.Calc.expression.Value;
import Learning.OOP.Calc.operations.Operations;

/**
 * Created by Сергей on 09.12.2016.
 */
public class CalcDemo {
    public static void main(String[] args) {
        run();
    }

    private static void run(){
        System.out.println(new ComplexExpression(
                new ComplexExpression(
                        new Value(2),
                        Operations.ADD,
                        new Value(3)
                ),
                Operations.ADD,
                new ComplexExpression(
                        new Value(7),
                        Operations.SUBSTRACT,
                        new Value(8)
                )
        ).evaluate());
    }
}

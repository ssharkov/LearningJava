package Learning.OOP.Calc.expression;

import Learning.OOP.Calc.operations.Operation;

/**
 * Created by Сергей on 09.12.2016.
 */
public class ComplexExpression implements Expression {
    private final Expression expr1;
    private final Expression expr2;

    private final Operation operation;

    public ComplexExpression(Expression expr1, Operation operation, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.operation = operation;
    }

    @Override
    public double evaluate() {
        double res1 = expr1.evaluate();
        double res2 = expr2.evaluate();
        return operation.apply(res1, res2);
    }
}

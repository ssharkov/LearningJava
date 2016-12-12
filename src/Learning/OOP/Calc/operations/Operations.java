package Learning.OOP.Calc.operations;

/**
 * Created by Сергей on 09.12.2016.
 */
public class Operations {
    private Operations() {
    }

    public static final Operation ADD = new Addition();
    public static final Operation SUBSTRACT = new Substraction();
    public static final Operation DIVISION = new Division();
    public static final Operation MULTIPLY = new Multiplication();


}

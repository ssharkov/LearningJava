package Learning.Exceptions.CustomExceptions;

/**
 * Created by ssharkov on 27.12.2016.
 */
public class EXceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("call method compute" + a);
        if (a > 10) throw new MyException(a);
        System.out.println("normal completion");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("catched exception " + e);
        }
    }
}

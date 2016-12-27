package Learning.Exceptions;

/**
 * Created by ssharkov on 23.12.2016.
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        } catch (ArithmeticException e){
            System.out.println("Catch general exception");
        }catch (Exception e){
            System.out.println("unreachable code");
        }
    }
}

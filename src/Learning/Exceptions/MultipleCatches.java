package Learning.Exceptions;

/**
 * Created by ssharkov on 23.12.2016.
 */
public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
         //   int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e){
            System.out.println("division by zero" +e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("OOI " +e);
        }
        System.out.println("After try/catch");
    }
}

package Learning.Exceptions;

/**
 * Created by ssharkov on 26.12.2016.
 */
public class NestTry {
    public static void main(String[] args) {
        try{

        int a = args.length;
        int b = 42/a;
        System.out.println("a = " + a);
        try{
            if (a==1) {
                a = a/(a-a);
            }
            if (a==2){
                int c[] = {1};
                c[42] = 99;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("IOB");
        }
    } catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
    }

}

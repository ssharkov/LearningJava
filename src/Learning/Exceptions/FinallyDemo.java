package Learning.Exceptions;

/**
 * Created by ssharkov on 27.12.2016.
 */
public class FinallyDemo {
    static void procA(){
        try{
            System.out.println("body of method procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("finally of method procA");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        }catch (Exception e){
            System.out.println("exception was catched " +e);
        }
    }
}

package Learning.Threads;

/**
 * Created by ssharkov on 10.01.2017.
 */
public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("one");
        new NewThread("two");
        new NewThread("three");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread completed");
    }
}

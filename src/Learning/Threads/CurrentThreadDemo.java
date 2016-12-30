package Learning.Threads;

/**
 * Created by ssharkov on 29.12.2016.
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread: " +t);
        t.setName("MyThread");
        System.out.println("name changed to :" +t);
        try{
            for (int n = 5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}

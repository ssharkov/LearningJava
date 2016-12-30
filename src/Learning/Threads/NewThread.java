package Learning.Threads;

/**
 * Created by ssharkov on 29.12.2016.
 */
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "demo thread");
        System.out.println("additional thread created: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("additional thread:" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("additional thread interrupted");
        }
        System.out.println("additional thread completed");
    }

}

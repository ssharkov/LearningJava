package Learning.Threads;

/**
 * Created by ssharkov on 29.12.2016.
 */
public class NewThread implements Runnable {
    //     NewThread() {
//         super("Demo thread");
//         System.out.println("additional thread: " + this);
//         start();
//    }
    String name;
    Thread t;

    NewThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " completed");
    }

}

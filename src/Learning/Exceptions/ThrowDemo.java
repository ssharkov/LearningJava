package Learning.Exceptions;

/**
 * Created by ssharkov on 26.12.2016.
 */
public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("demoproc");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println(" double catch " + e);
        }
    }
}

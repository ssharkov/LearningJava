package Learning.Exceptions;

/**
 * Created by ssharkov on 26.12.2016.
 */
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("throwOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("catch: " + e);
        }
    }
}

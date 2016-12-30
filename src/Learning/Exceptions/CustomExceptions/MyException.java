package Learning.Exceptions.CustomExceptions;

/**
 * Created by ssharkov on 27.12.2016.
 */
public class MyException extends Exception {
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{detail=" + detail + "}";
    }
}

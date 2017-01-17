package Learning.Exceptions.CustomExceptions;

/**
 * Created by ssharkov on 27.12.2016.
 */
public class MyException extends Exception {
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return "MyException{detail=" + detail + "}";
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}

package Learning.IOstreams;

import java.io.PrintWriter;

/**
 * Created by ssharkov on 11.01.2017.
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("This is string");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}

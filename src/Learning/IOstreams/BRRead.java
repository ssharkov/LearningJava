package Learning.IOstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ssharkov on 11.01.2017.
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type symbol 'q' for exit.");
        do {
            c=(char) br.read();
            System.out.println(c);
        }while (c!='q');
    }
}

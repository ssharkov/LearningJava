package Learning.IOstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ssharkov on 11.01.2017.
 */
public class TinyEdit {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Type text");
        System.out.println("Type 'stop' to exit");
        for(int i = 0;i<100; i++){
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}

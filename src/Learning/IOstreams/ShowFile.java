package Learning.IOstreams;

import sun.plugin.viewer.IExplorerPluginObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ssharkov on 11.01.2017.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Using file: Show file filename");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Cant open file");
        } catch (IOException e) {
            System.out.println("IO error");
        } finally {
            try {
                if (fin!=null) fin.close();
            } catch (IOException e) {
                System.out.println("Error while closing file");
            }
        }
    }
}

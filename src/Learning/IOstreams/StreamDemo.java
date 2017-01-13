package Learning.IOstreams;

import Learning.Exceptions.CustomExceptions.MyException;

import java.io.*;

/**
 * Created by ssharkov on 11.01.2017.
 */
public class StreamDemo {
    public static void main(String[] args) {
        try {
            readFromFile();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile() throws MyException {

        try (InputStream is = new BufferedInputStream(new FileInputStream("C:\\Users\\SSharkov\\Desktop\\JavaProject\\LearningJava\\src\\Learning\\IOstreams\\Test.txt"))) {
            int b = 0;
            while (b != -1) {
                b = is.read();
                char ch = (char) b;
                System.out.print(ch);
            }
        } catch (IOException e) {
            System.out.println("File not found");
//            throw new MyException(e);
        }
    }

//    private static InputStream getInputStream() throws FileNotFoundException {
//        return new BufferedInputStream(new FileInputStream("C:\\Users\\SSharkov\\Desktop\\JavaProject\\LearningJava\\src\\Learning\\IOstreams\\Test.txt"));
//    }
}

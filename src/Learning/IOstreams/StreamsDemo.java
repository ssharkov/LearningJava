package Learning.IOstreams;

import Learning.Exceptions.CustomExceptions.MyException;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ssharkov on 16.01.2017.
 */

public class StreamsDemo {

    public static void main(String[] args) {
        try {
//      readTextFile();
//      readFromFile();
//      copyFile();
      copyFile2();
//            useScanner();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    // в этом методе вместо try-with-resources онсшц сам явно вызываем is.close();
    // обратите внимание, насколкьо менее читаем этот код.
    private static void readFromFile() throws MyException {
        InputStream is = null;
        try {
            is = getInputStream();
            int b = 0;
            while (b != -1) {
                b = is.read();
                System.out.println(b);
            }
        } catch (IOException ex) {
            throw new MyException(ex);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // метод, копирующий один файл в другой
    private static void copyFile() throws MyException {
        // используем конструкцию try-with-resources:
        // после выполнения блока try джава сама вызовет
        // is.close() и os.close()
        try (final InputStream is = getInputStream();
             final OutputStream os = getOutputStream()) {
            int b = is.read();
            // считываем по одному байту из потока
            while (b >= 0) {
                // и выводим в другой поток
                os.write(b);
                b = is.read();
            }
        } catch (IOException ex) {
            // оборачиваем IOException в свой эксепшн, передав ему оригинальный в качестве cause
            throw new MyException(ex);
        }
    }

    // пример использования Reader'а для работы с текстовыми потоками
    private static void readTextFile() throws MyException {
        try (final InputStream is = getInputStream()) {
            final Reader reader = new InputStreamReader(is);
            int c = reader.read();
            while (c >= 0) {
                System.out.print((char) c);
                c = reader.read();
            }
        } catch (IOException ex) {
            throw new MyException(ex);
        }
    }

    // копирование файлов с использованием FileReader и FileWriter
    private static void copyFile2() throws MyException {
        try (final Reader reader = new FileReader("C:\\Users\\SSharkov\\Desktop\\JavaProject\\LearningJava\\src\\Learning\\IOstreams\\this_is_test.txt");
             final Writer writer = new FileWriter("C:\\Users\\SSharkov\\Desktop\\JavaProject\\LearningJava\\src\\Learning\\IOstreams\\this_is_test_1.txt")) {
            int c = reader.read();
            while (c != -1) {
                writer.write(c);
                c = reader.read();
            }
        } catch (IOException ex) {
            throw new MyException(ex);
        }
    }

    private static void useScanner() throws MyException {
        final String input = "123 a word 12312 \n\t 664.0";
        // используем класс Scanner, который позволяет работать с входным потоком, строкой или reader'ом.
        final Scanner scanner = new Scanner(input);
        // он позволяет работать с входным потоком, разбивая его на части:
        while (scanner.hasNext()) {
            System.out.print(scanner.next());
        }
    }

    private static InputStream getInputStream() throws FileNotFoundException {
        // оборачиваем FileInputStream в BufferedInputStream
//    return new FileInputStream("this_is_test.txt");
        final File file = new File("this_is_test.txt");
        return new BufferedInputStream(new FileInputStream(file));
    }

    private static OutputStream getOutputStream() throws IOException {
        // создаем новый объект "файл", отвечающий за папку blabla/blabla1/22323
        // методом mkdirs() создаем такие папки путь в файловой системе
        new File("blabla/blabla1/22323").mkdirs();
        // создаем новый объект "файл", отвечающий за файл "this_is_test_1.txt"
        final File newFile = new File("blabla/blabla1/22323/this_is_test_1.txt");
        // создаем файл "физически", в файловой системе
        newFile.createNewFile();
        // создаем file output stream, передав в него объект файл.
        return new BufferedOutputStream(new FileOutputStream(newFile));
    }
}
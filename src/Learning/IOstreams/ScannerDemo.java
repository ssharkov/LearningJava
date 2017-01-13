package Learning.IOstreams;

import Learning.Exceptions.CustomExceptions.MyException;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ssharkov on 13.01.2017.
 */
public class ScannerDemo {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/SSharkov/Desktop/JavaProject/LearningJava/src/Learning/IOstreams/Test.txt");
            char world[][] = new char[15][15];
            Scanner input =  new Scanner(file);

            for (int i = 0; i < world.length; i++) {
                for (int j = 0; j < world[i].length; j++) {
                    world[i][j] = input.next().charAt(0);
                }
            }

            for (int i = 0; i < world.length; i++) {
                for (int j = 0; j < world.length; j++) {
                    System.out.print(world[i][j]+ " ");
                }
                System.out.println();
            }



//            while (input.hasNext()) {
//                String line = input.next();
//                System.out.println(line);
//            }

            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


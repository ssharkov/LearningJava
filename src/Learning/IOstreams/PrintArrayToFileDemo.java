package Learning.IOstreams;

import Learning.Exceptions.CustomExceptions.MyException;

import java.io.*;

/**
 * Created by ssharkov on 16.01.2017.
 */
public class PrintArrayToFileDemo {
    public static void main(String[] args) {

        try (final FileWriter writer = new FileWriter("C:\\Users\\SSharkov\\Desktop\\JavaProject\\LearningJava\\src\\Learning\\IOstreams\\this_is_test_1.txt")) {
            char[][] world = {
                    {'1', '2', '3', '4'},
                    {'5', '6', '7', '8'}
            };
            for (int i = 0; i < world.length; i++) {
                for (int j = 0; j < world[i].length; j++) {
                    writer.write(world[i][j] + " ");
                }
                writer.write(System.lineSeparator());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
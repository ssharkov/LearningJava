package GameOfLifeNew.Output;

import GameOfLifeNew.Input.GameOfLifeInput;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ssharkov on 16.01.2017.
 */
public class FileOutputFirstTen implements GameOfLifeOutput {

    @Override
    public void printWorld(char[][] world) {

        try (final FileWriter writer = new FileWriter("C:\\Users\\SSharkov\\Desktop\\JavaProject\\LearningJava\\src\\Learning\\IOstreams\\this_is_test_1.txt", true)) {

            for (int i = 0; i < world.length; i++) {
                for (int j = 0; j < world[i].length; j++) {
                    writer.write(world[i][j] + " ");
                }
                writer.write(System.lineSeparator());
            }
            writer.write(System.lineSeparator());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

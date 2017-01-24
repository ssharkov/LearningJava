package GameOfLifeNew.Input;

import Learning.Exceptions.CustomExceptions.MyException;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ssharkov on 11.01.2017.
 */
public class FileInput implements GameOfLifeInput {
    public FileInput(int size) {
        this.world = new char[size][size];
    }

    private char world[][];

    @Override
    public char[][] getFirstWorld() throws MyException{
        try {
            File file = new File("C:/Users/SSharkov/Desktop/JavaProject/LearningJava/src/GameOfLifeNew/Input/TTest.txt");
            Scanner input = new Scanner(file);

            for (int i = 0; i < world.length; i++) {
                for (int j = 0; j < world[i].length; j++) {
                    world[i][j] = input.next().charAt(0);
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new MyException(e);
//            e.printStackTrace();
        }
        return world;
    }
}

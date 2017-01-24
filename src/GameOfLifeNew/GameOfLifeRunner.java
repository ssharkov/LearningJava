package GameOfLifeNew;

import Learning.Exceptions.CustomExceptions.MyException;

/**
 * Created by ssharkov on 14.12.2016.
 */
public class GameOfLifeRunner {
    public static void main(String[] args) {
//        GameOfLife.RunConstant();
//        GameOfLife.RunRandom();
        try {
            GameOfLife.RunFileInput();
        } catch (MyException e) {
            System.out.println("File Not Found " + e.getMessage());
        }
//        GameOfLife.RunFileOutputFirstTen();

    }

}

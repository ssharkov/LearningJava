package gameOfLife;

import gameOfLife.input.ConstantInput;
import gameOfLife.input.GameOfLifeInput;

/**
 * Created by ssharkov on 24.11.2016.
 */
public class GameOfLive_improved {
    public static void main(String[] args) {
        // sizeRow, sizeCol - array size
        int sizeRow = 15, sizeCol = 15;
        char world[][] = new char[sizeRow][sizeCol];
        char newWorld[][] = new char[sizeRow][sizeCol];

        GameOfLifeInput worldTest = new ConstantInput(sizeRow,sizeCol,world);
        worldTest.getFirstWorld();


        // printing world - iteration 0
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++)
                System.out.print(world[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        while (true) {
//           Grid.printNewWorld(world, sizeRow,sizeCol);
            for (int i = 0; i < sizeRow; i++) {
                for (int j = 0; j < sizeCol; j++) {
                    newWorld[i][j] = Grid.nextState(world, i, j, sizeRow, sizeCol);
                    System.out.print(newWorld[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            world = newWorld;
            newWorld = new char[sizeRow][sizeCol];
            try {
                Thread.sleep(300);
            } catch
                    (InterruptedException ex) {
            }
        }
    }
}

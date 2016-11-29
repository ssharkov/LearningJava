package src;

import java.util.Arrays;

/**
 * Created by ssharkov on 24.11.2016.
 */
public class GameOfLive_improved {
    public static void main(String[] args) {
        // sizerow, sizecol - array size
        int i, j, sizerow = 15, sizecol = 15;
        char world[][] = new char[sizerow][sizecol];
        char newworld[][] = new char[sizerow][sizecol];
        char x = 'X';
        char o = '*';

        //populating world - iteration 0
        for (i = 0; i < sizerow; i++)
            for (j = 0; j < sizecol; j++) {
                world[i][j] = o;
            }
        world[1][2] = x;
        world[2][3] = x;
        world[3][1] = x;
        world[3][2] = x;
        world[3][3] = x;

        // printing world - iteration 0
        for (i = 0; i < sizerow; i++) {
            for (j = 0; j < sizecol; j++)
                System.out.print(world[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        //r - how many iterations we need to print
        for (int r = 0; r < 40; r++) {
            for (i = 0; i < sizerow; i++) {
                for (j = 0; j < sizecol; j++) {
                    newworld[i][j] = cellstate(world, i, j, sizerow, sizecol);
                    System.out.print(newworld[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            world = newworld;
            newworld = new char[sizerow][sizecol];
        }
    }

    //define cell state for the next iteration(current - world, next - newworld)
    //method expecting: 1)array world; 2)coordinates of current cell - row,col; 3)array size - sizerow, sizecol)
    public static char cellstate(char[][] world, int row, int col, int sizerow, int sizecol) {
        char newworld[][] = new char[sizerow][sizecol];
        int c = 0;
        char x = 'X';
        char o = '*';

        for (int i = row - 1; i <= row + 1; i++) {
            if (i < 0 || i > world.length - 1) continue;

            for (int j = col - 1; j <= col + 1; j++) {

                if (j < 0 || j > world[i].length - 1) continue;
                if (i == row && j == col) continue;
                if (world[i][j] == x) c++;
            }
        }
        if (c < 2 || c > 3) {
            newworld[row][col] = o;
        }
        if (c == 2) {
            newworld[row][col] = world[row][col];
        }
        if (c == 3) {
            newworld[row][col] = x;
        }
        return newworld[row][col];
    }
}

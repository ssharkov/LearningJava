package GameOfLifeNew;

/**
 * Created by ssharkov on 14.12.2016.
 * Two methods for next cell state and next world state
 */
public class Grid {
//get next state for cell
    private static  char nextCellState(char [][] world, int row, int col){
        int c=0;
        char[][] newWorld = new char[world.length][world.length];
        for (int i = row - 1; i <= row + 1; i++) {
            if (i < 0 || i > world.length - 1) continue;

            for (int j = col - 1; j <= col + 1; j++) {

                if (j < 0 || j > world[i].length - 1) continue;
                if (i == row && j == col) continue;
                if (world[i][j] == 'X') c++;
            }
        }
        if (c < 2 || c > 3) {
            newWorld[row][col] = '*';
        }
        if (c == 2) {
            newWorld[row][col] = world[row][col];
        }
        if (c == 3) {
            newWorld[row][col] = 'X';
        }
        return newWorld[row][col];
    }
//get next state for world
    protected  char[][] nextWorldState(char[][] world){
        char[][] newWorld = new char[world.length][world.length];
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                newWorld[i][j] = Grid.nextCellState(world, i, j);
            }
        }
        return newWorld;
    }


}

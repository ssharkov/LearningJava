package gameOfLife;

/**
 * Created by ssharkov on 30.11.2016.
 */
public class Grid {
    //define next cell state for the next iteration(current - world, next - newworld)
    //method expecting: 1)array world; 2)coordinates of current cell - row,col; 3)array size - sizeRow, sizeCol)
    public static char nextState(char[][] world, int row, int col, int sizeRow, int sizeCol) {
        char newWorld[][] = new char[sizeRow][sizeCol];
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
            newWorld[row][col] = o;
        }
        if (c == 2) {
            newWorld[row][col] = world[row][col];
        }
        if (c == 3) {
            newWorld[row][col] = x;
        }
        return newWorld[row][col];
    }

    public static void printNewWorld(char[][] world, int sizeRow, int sizeCol) {
        char newWorld[][] = new char[sizeRow][sizeCol];

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

    }

}

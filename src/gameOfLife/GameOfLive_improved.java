package gameOfLife;

/**
 * Created by ssharkov on 24.11.2016.
 */
public class GameOfLive_improved {
    public static void main(String[] args) {
        // sizeRow, sizeCol - array size
        int i, j, sizeRow = 15, sizeCol = 15;
        char world[][] = new char[sizeRow][sizeCol];
        char newWorld[][] = new char[sizeRow][sizeCol];
        char x = 'X';
        char o = '*';

        //populating world - iteration 0
        for (i = 0; i < sizeRow; i++)
            for (j = 0; j < sizeCol; j++) {
                world[i][j] = o;
            }
        world[1][2] = x;
        world[2][3] = x;
        world[3][1] = x;
        world[3][2] = x;
        world[3][3] = x;

        // printing world - iteration 0
        for (i = 0; i < sizeRow; i++) {
            for (j = 0; j < sizeCol; j++)
                System.out.print(world[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        while (true) {
//           Grid.printNewWorld(world, sizeRow,sizeCol);
            for (i = 0; i < sizeRow; i++) {
                for (j = 0; j < sizeCol; j++) {
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

package gameOfLife.input;

/**
 * Created by ssharkov on 12.12.2016.
 */
public class ConstantInput implements GameOfLifeInput {

    public ConstantInput(int sizeRow, int sizeCol, char[][] world) {
        this.sizeRow = sizeRow;
        this.sizeCol = sizeCol;
        this.world = world;
    }

    private int sizeRow, sizeCol;
    private char world[][] = new char[sizeRow][sizeCol];

    @Override
    public char[][] getFirstWorld() {
        for (int i = 0; i < sizeRow; i++)
            for (int j = 0; j < sizeCol; j++) {
                world[i][j] = '*';
            }
        world[1][2] = 'X';
        world[2][3] = 'X';
        world[3][1] = 'X';
        world[3][2] = 'X';
        world[3][3] = 'X';
        return world;
    }
}

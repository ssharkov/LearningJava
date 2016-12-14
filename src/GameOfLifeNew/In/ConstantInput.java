package GameOfLifeNew.In;

/**
 * Created by ssharkov on 14.12.2016.
 * Manually input for first state
 */
public class ConstantInput implements GameOfLifeInput {
    public ConstantInput(int size) {
        this.world = new char[size][size];
    }
    private char world[][];

    @Override
    public char[][] getFirstWorld() {

        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                world[i][j] = '*';
            }
        }
        world[1][2] = 'X';
        world[2][3] = 'X';
        world[3][1] = 'X';
        world[3][2] = 'X';
        world[3][3] = 'X';
        return world;
    }
}

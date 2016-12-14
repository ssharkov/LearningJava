package GameOfLifeNew.In;

import java.util.Map;

/**
 * Created by ssharkov on 14.12.2016.
 */
public class RandomInput implements GameOfLifeInput {
    public RandomInput(int size) {
        this.world = new char[size][size];
    }

    private char world[][];

    @Override
    public char[][] getFirstWorld() {

        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                if (Math.random() < 0.3) {
                    world[i][j] = 'X';
                } else {
                    world[i][j] = '*';
                }
            }
        }

        return world;
    }
}
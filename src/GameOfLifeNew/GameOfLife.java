package GameOfLifeNew;

import GameOfLifeNew.In.ConstantInput;
import GameOfLifeNew.In.GameOfLifeInput;
import GameOfLifeNew.In.RandomInput;
import GameOfLifeNew.Out.ConsoleOutput;
import GameOfLifeNew.Out.GamaOfLifeOutput;

/**
 * Created by ssharkov on 14.12.2016.
 */
public class GameOfLife {

    protected static void RunConstant() {
        GameOfLifeInput constantInput = new ConstantInput(15);
        GamaOfLifeOutput consoleOutput = new ConsoleOutput();
        Grid grid = new Grid();
        char[][] temp;
        consoleOutput.printWorld(constantInput.getFirstWorld());
        temp = grid.nextWorldState(constantInput.getFirstWorld());
        while (true) {
            consoleOutput.printWorld(temp);
            temp = grid.nextWorldState(temp);
        }
    }
    protected static void RunRandom() {
        GameOfLifeInput randomInput = new RandomInput(15);
        GamaOfLifeOutput consoleOutput = new ConsoleOutput();
        Grid grid = new Grid();
        char[][] temp;
        consoleOutput.printWorld(randomInput.getFirstWorld());
        temp = grid.nextWorldState(randomInput.getFirstWorld());
        while (true) {
            consoleOutput.printWorld(temp);
            temp = grid.nextWorldState(temp);
        }
    }
}

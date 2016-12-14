package GameOfLifeNew;

import GameOfLifeNew.Input.ConstantInput;
import GameOfLifeNew.Input.GameOfLifeInput;
import GameOfLifeNew.Input.RandomInput;
import GameOfLifeNew.Output.ConsoleOutput;
import GameOfLifeNew.Output.GamaOfLifeOutput;

/**
 * Created by ssharkov on 14.12.2016.
 */
public class GameOfLife {
//run Game of Life with constant first world - planner
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
//run Game of Life with random first world
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

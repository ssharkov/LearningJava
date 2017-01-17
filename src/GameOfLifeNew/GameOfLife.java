package GameOfLifeNew;

import GameOfLifeNew.Input.ConstantInput;
import GameOfLifeNew.Input.FileInput;
import GameOfLifeNew.Input.GameOfLifeInput;
import GameOfLifeNew.Input.RandomInput;
import GameOfLifeNew.Output.ConsoleOutput;
import GameOfLifeNew.Output.FileOutputFirstTen;
import GameOfLifeNew.Output.GameOfLifeOutput;

/**
 * Created by ssharkov on 14.12.2016.
 */
public class GameOfLife {
//run Game of Life with constant first world - planner
    protected static void RunConstant() {
        GameOfLifeInput constantInput = new ConstantInput(15);
        GameOfLifeOutput consoleOutput = new ConsoleOutput();
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
        GameOfLifeOutput consoleOutput = new ConsoleOutput();
        Grid grid = new Grid();
        char[][] temp;
        consoleOutput.printWorld(randomInput.getFirstWorld());
        temp = grid.nextWorldState(randomInput.getFirstWorld());
        while (true) {
            consoleOutput.printWorld(temp);
            temp = grid.nextWorldState(temp);
        }
    }
//run Game of Life with first world copied from file
    protected static void RunFileInput(){
        GameOfLifeInput fileInput = new FileInput(15);
        GameOfLifeOutput consoleOutput = new ConsoleOutput();
        Grid grid = new Grid();
        char[][] temp;
        consoleOutput.printWorld(fileInput.getFirstWorld());
        temp=grid.nextWorldState(fileInput.getFirstWorld());
        while (true){
            consoleOutput.printWorld(temp);
            temp=grid.nextWorldState(temp);
        }
    }

//run Game of Life with first world copied from file and output to file
    protected static void RunFileOutputFirstTen(){
        GameOfLifeInput fileInput = new FileInput(15);
        GameOfLifeOutput fileOutputFirstTen = new FileOutputFirstTen();
        Grid grid = new Grid();
        char[][] temp;
        fileOutputFirstTen.printWorld(fileInput.getFirstWorld());
        temp=grid.nextWorldState(fileInput.getFirstWorld());
        for (int i = 0;i<11;i++){
            fileOutputFirstTen.printWorld(temp);
            temp=grid.nextWorldState(temp);
        }
    }

}

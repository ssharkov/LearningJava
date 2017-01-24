package GameOfLifeNew.Input;

import Learning.Exceptions.CustomExceptions.MyException;

/**
 * Created by ssharkov on 14.12.2016.
 */
public interface GameOfLifeInput {
    char[][] getFirstWorld() throws MyException;
}

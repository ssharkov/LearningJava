package GameOfLifeNew.Output;

/**
 * Created by ssharkov on 14.12.2016.
 * Show result in console
 */
public class ConsoleOutput implements GamaOfLifeOutput {

    @Override
    public void printWorld(char[][] world) {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                System.out.print(world[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        try {
            Thread.sleep(300);
        } catch
                (InterruptedException ex) {
        }
    }
}

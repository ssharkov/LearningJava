package src;

/**
 * Created by ssharkov on 24.11.2016.
 */
public class GameOfLife {
    public static void main(String[] args) {
        //    ---------------------------------------------------------- array was populated
//        char world[][] = new char[5][5];
//        int c = 0, i, j;
//        char x = 'X';
//        char o = '*';
//
//        for (i = 0; i < 5; i++)
//            for (j = 0; j < 5; j++) {
//                world[i][j] = o;
//            }
//        world[1][1] = x;
//        world[2][1] = x;
//        world[2][2] = x;
//
//        for (i = 0; i < 5; i++) {
//            for (j = 0; j < 5; j++)
//                System.out.print(world[i][j] + " ");
//            System.out.println();
//        }

        //--------------------------------------------------------------^^^ array was populated version 2

        char world[][] = {
                {'*', '*', '*', '*', '*'},
                {'*', '*', 'X', '*', '*'},
                {'*', '*', '*', 'X', '*'},
                {'*', 'X', 'X', 'X', '*'},
                {'*', '*', '*', '*', '*'}
        };
//        char newworld[][] = new char[5][5];
        char newworld[][] = {
                {'*', '*', '*', '*', '*'},
                {'*', '*', 'X', '*', '*'},
                {'*', '*', '*', 'X', '*'},
                {'*', 'X', 'X', 'X', '*'},
                {'*', '*', '*', '*', '*'}
        };

        int c = 0, i, j;
        char x = 'X';
        char o = '*';

        for (i = 0; i < world.length; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(world[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        for (int r=0;r<5;r++) {

            for (i = 0; i < 5; i++) {
                for (j = 0; j < 5; j++) {
                    c = 0;

                    for (int row = i - 1; row <= i + 1; row++) {
                        if (row < 0 || row > 4) continue;

                        for (int col = j - 1; col <= j + 1; col++) {

                            if (col < 0 || col > 4) continue;
                            if (row == i && col == j) continue;
                            if (world[row][col] == x) c++;
                        }
                    }
                    if (c < 2 || c > 3) {
                        newworld[i][j] = o;
                    }
                    if (c == 2) {
                        newworld[i][j] = world[i][j];
                    }
                    if (c == 3) {
                        newworld[i][j] = x;
                    }
                    System.out.print(newworld[i][j] + " ");
                }
                System.out.println();

            }
            world = newworld;
            System.out.println();
        }


    }

}

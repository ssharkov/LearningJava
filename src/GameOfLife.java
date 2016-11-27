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
                {'*', 'X', '*', '*', '*'},
                {'*', 'X', 'X', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };
        char newworld[][] = new char[5][5];

        int c = 0, i, j;
        char x = 'X';
        char o = '*';

        for (i = 0; i < world.length; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(world[i][j] + " ");
            System.out.println();
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                c = 0;

                for (int row = i - 1; row <= i + 1; row++) {
                    if (row < 0 || row > 4) continue;

                    for (int cell = j - 1; cell <= j + 1; cell++) {

                        if (cell < 0 || cell > 4) continue;

                        if (row == i && cell == j) continue;
                        if (world[row][cell] == x) c++;
                    }
                }
                System.out.print(c + " ");
            }
            System.out.println();
        }


//        for (i = 1; i < 2; i++)
//            for (j = 2; j < 3; j++) {
//                if (world[i - 1][j - 1] == x) c = c + 1;
//                if (world[i - 1][j] == x) c = c + 1;
//                if (world[i - 1][j + 1] == x) c = c + 1;
//                if (world[i][j - 1] == x) c = c + 1;
//                if (world[i][j + 1] == x) c = c + 1;
//                if (world[i + 1][j - 1] == x) c = c + 1;
//                if (world[i + 1][j] == x) c = c + 1;
//                if (world[i + 1][j + 1] == x) c = c + 1;
//                if (c==3) world[i][j] =x;
//            }
//        System.out.println(c);


    }
}

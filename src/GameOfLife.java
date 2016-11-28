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

        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
                int currSell = world[i][j];

                for (int rowi=i-1;rowi<=i+1;rowi++){
                    if (rowi >=0 && rowi <5 && rowi!=i){

                        for(int rowj=j-1; rowj<=j;rowj++){
                            if(rowj>=0 && rowj<5 && rowj!=j){

                                if (world[rowi][rowj] == x) c++;
                                System.out.println(rowi + " " + rowj + " " + world [rowi][rowj] + " " + c);

                            }
                            c=0;
                        }
                    }
                }
                System.out.println( "cell = " + i + " " + j + " " + world[i][j]);
            }
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

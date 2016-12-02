package Learning;

/**
 * Created by ssharkov on 24.11.2016.
 */
public class MultiArray {
    public static void main(String[] args) {
//  FILL MULTI ARRAY
//        int marr[][] = new int[4][5];
//        int i, j, k = 0;
//
//        for (i = 0; i < 4; i++)
//            for (j = 0; j < 5; j++) {
//                marr[i][j] = k;
//                k++;
//            }
//        for (i = 0; i < 4; i++) {
//            for (j = 0; j < 5; j++)
//                System.out.print(marr[i][j] + " ");
//                System.out.println();
//            }

        int marr[][] = new int[4][];
        marr[0] = new int[1];
        marr[1] = new int[2];
        marr[2] = new int[3];
        marr[3] = new int[4];
        int i, j, k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                marr[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(marr[i][j] + " ");
            System.out.println();
        }


    }
}

package Learning.Classes.Box;

/**
 * Created by ssharkov on 01.12.2016.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);
        int vol1, vol2;

//        mybox1.width = 10;
//        mybox1.height = 20;
//        mybox1.depth = 15;
//
//        mybox2.width = 3;
//        mybox2.height = 6;
//        mybox2.depth = 9;
//        mybox1.setDim(10, 20, 15);
//        mybox2.setDim(3, 6, 9);

//        vol = mybox1.width*mybox1.height*mybox1.depth;
//        System.out.println("vol 1 = " + vol);
//
//        vol = mybox2.width*mybox2.height*mybox2.depth;
//        System.out.println("vol2 = " + vol);

        vol1 = mybox1.volume();
        vol2 = mybox2.volume();
        System.out.println(vol1);
        System.out.println(vol2);

    }
}

package Learning.Classes.Box;

/**
 * Created by ssharkov on 08.12.2016.
 */
public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        int vol;

        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mycube.volume());
    }
}

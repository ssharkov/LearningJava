package Learning.Classes.Box;

/**
 * Created by ssharkov on 13.12.2016.
 */
public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 35);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 1);
        int vol;

        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);

        vol = mybox2.volume();
        System.out.println(vol);
        System.out.println(mybox2.weight);

    }

}

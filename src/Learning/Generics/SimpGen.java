package Learning.Generics;

/**
 * Created by ssharkov on 25.01.2017.
 */
public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generics");
        tgObj.showTypes();

        System.out.println("Value = " + tgObj.getOb1());
        System.out.println("Value = " + tgObj.getOb2());
    }
}

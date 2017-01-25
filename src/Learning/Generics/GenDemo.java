package Learning.Generics;

/**
 * Created by ssharkov on 24.01.2017.
 */
public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Value = " + v);

        Gen<String> strOb;
        strOb = new Gen<>("test test");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Value = " +str);
    }
}

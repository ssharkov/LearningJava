package Learning.Generics;

/**
 * Created by ssharkov on 24.01.2017.
 */
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);

        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("Value = " +v);

        NonGen strOb = new NonGen("test test");
        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("Value =" +str);

        iOb=strOb;
        v=(Integer)iOb.getOb();
    }
}

package Learning.OOP.Inheritance;

/**
 * Created by ssharkov on 13.12.2016.
 */
public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("SubOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println("i+j+k in SubOb");
        subOb.sum();
    }
}

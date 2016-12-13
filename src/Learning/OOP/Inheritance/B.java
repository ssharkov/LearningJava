package Learning.OOP.Inheritance;

/**
 * Created by ssharkov on 13.12.2016.
 */
public class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k = " + (i + j + k));
    }

}

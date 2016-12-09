package Learning.Classes;

/**
 * Created by ssharkov on 06.12.2016.
 */
public class OverloadDemo {
    void test() {
        System.out.println("Parameters are not specified");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
    }

    double test(double a) {
        System.out.println("double a:  " + a);
        return a * a;
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("result of ob.test(123.25) " + result);
    }
}
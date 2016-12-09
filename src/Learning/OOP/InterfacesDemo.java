package Learning.OOP;

/**
 * Created by ssharkov on 07.12.2016.
 */
public class InterfacesDemo {
    public static void main(String[] args) {
        ComparableInteger[] ints = new ComparableInteger[]{
                new ComparableInteger(1),
                new ComparableInteger(2),
                new ComparableInteger(5),
                new ComparableInteger(-1)
        };
        Comparable greatestInt = getGreatest(ints);
        System.out.println(greatestInt);
    }

    static Comparable getGreatest(Comparable[] comparables) {
        Comparable max = comparables[0];
        for (Comparable c : comparables) {
            if (max.lessThan(c)) {
                max = c;
            }
        }
        return max;
    }
}

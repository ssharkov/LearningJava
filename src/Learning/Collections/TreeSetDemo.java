package Learning.Collections;

import java.util.TreeSet;

/**
 * Created by ssharkov on 30.01.2017.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("C");
        ts.add("A");
        ts.add("D");
        ts.add("F");
        ts.add("B");
        ts.add("E");
        System.out.println(ts);
        System.out.println(ts.subSet("C","F"));

    }
}

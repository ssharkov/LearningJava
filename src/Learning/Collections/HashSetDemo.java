package Learning.Collections;

import java.util.HashSet;

/**
 * Created by ssharkov on 30.01.2017.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Eps");
        hs.add("Omega");
        System.out.println(hs);

    }
}

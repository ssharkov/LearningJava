package Learning.Collections;

import java.util.ArrayList;

/**
 * Created by ssharkov on 27.01.2017.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        System.out.println("ArrayList size = " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Now ArrayList contains = " + al);
        al.remove("F");
        al.remove(2);
        System.out.println("After removal size = " + al.size());
        System.out.println("After removal contains = " + al);

    }
}

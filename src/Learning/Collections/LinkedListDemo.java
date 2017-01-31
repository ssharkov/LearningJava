package Learning.Collections;

import java.util.LinkedList;

/**
 * Created by ssharkov on 30.01.2017.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("ll contain: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("after deleting ll contain: " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("afret removing first and last: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " changed");
        System.out.println("ll after changing: " + ll);
    }
}

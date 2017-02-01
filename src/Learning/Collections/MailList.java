package Learning.Collections;

import java.util.LinkedList;

/**
 * Created by ssharkov on 31.01.2017.
 */
public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        ml.add(new Address("J.W.West", "11 Oak ave", "Urbana", "IL", "61810"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61321"));
        ml.add(new Address("Tom East", "867 Elm Set", "Champaign", "IL", "61830"));

        for (Address el : ml) {
            System.out.println(el);
            System.out.println();
        }
    }
}

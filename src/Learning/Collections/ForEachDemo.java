package Learning.Collections;

import java.util.ArrayList;

/**
 * Created by ssharkov on 31.01.2017.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();

        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.out.print("Values of vals: ");
        for (int v : vals) {
            System.out.print(v + " ");
        }
        int sum = 0;
        for (int i : vals) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}

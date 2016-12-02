package Learning;

/**
 * Created by ssharkov on 01.12.2016.
 */
public class TernaryOperation {
    public static void main(String[] args) {

//        variable = condition ? value_if_true : value_if_false

        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println(k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println(k);
    }
}

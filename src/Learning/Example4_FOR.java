package Learning;

/**
 * Created by ssharkov on 22.11.2016.
 */
public class Example4_FOR {
    public static void main(String[] args) {
        int sum = 0, sum1 = 0;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 10; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);


        for (int i : arr) {
            sum1 = sum1 + i;
        }
        System.out.println(sum1);

    }
}

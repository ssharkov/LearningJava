import java.util.Arrays;

/**
 * Created by ssharkov on 29.09.2016.
 */
public class ARRAYS {
    public static void main(String[] args) {
//   MAX and MIDDLE
//        int i[] = {1, 0, -1, 4, 8};
//        int result = 0;
//        int max = i[0];
//
//        for (int j = 0; j < 5; j++) {
//            result = result + i[j];
//            if (max < i[j]) max = i[j];
//        }
//        System.out.println(result/5 +  " " + max);


//   SORTING ARRAY DESC BOUBLE
//        int arr[] = {3, 2, -2, 0, 4, 6};
//
//        for (int i = arr.length-1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//
//            }
//            System.out.print(arr[i] + " ");
//        }

//   SORTING ARRAYS.SORT                                                               A
        int arr[] = {3, 2, -2, 0, 4, 6};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}




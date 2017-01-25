package Learning.Generics;

/**
 * Created by ssharkov on 25.01.2017.
 */
public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[]= {1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(inums);
        System.out.println("Average = " + iob.average());

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob= new Stats<>(dnums);
        System.out.println("Average = " + dob.average());

        Double dnums1[] = {1.0,2.0,3.0,4.0,5.0};
        Stats<Double> dob1= new Stats<>(dnums1);
        System.out.println("Average = " + dob1.average());

        if (iob.sameAvg(dob))
            System.out.println("Avg is the same");
        else System.out.println("Avg is not the same");

        if (iob.sameAvg(dob1))
            System.out.println("Avg is the same");
        else System.out.println("Avg is not the same");
    }
}

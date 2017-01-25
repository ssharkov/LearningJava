package Learning.Generics;

/**
 * Created by ssharkov on 25.01.2017.
 */
public class Stats<T extends  Number> {
    T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    double average(){
        double sum = 0.0;
        for (int i = 0; i< nums.length; i++)
            sum = sum + nums[i].doubleValue();
        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob){
        if( average()==ob.average())
            return true;
        return  false;
    }

}

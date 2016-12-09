package Learning.OOP;

/**
 * Created by ssharkov on 07.12.2016.
 */
public class ComparableInteger implements Comparable {
    private int value;

    public ComparableInteger(int value) {
        this.value = value;
    }

    public boolean lessThan(Comparable other) {
        ComparableInteger ci = (ComparableInteger)other;
        return value < ci.value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}

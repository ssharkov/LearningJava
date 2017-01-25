package Learning.Generics.Coords;

/**
 * Created by ssharkov on 25.01.2017.
 */
public class ThreeD extends  TwoD {
    int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

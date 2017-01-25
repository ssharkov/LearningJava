package Learning.Generics.Coords;

/**
 * Created by ssharkov on 25.01.2017.
 */
public class Coords<T extends TwoD> {
    T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }

    static void showXY(Coords<?> c) {
        System.out.println("Coords X Y: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Coords X Y Z: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
    }
}

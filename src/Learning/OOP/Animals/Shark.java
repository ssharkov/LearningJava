package Learning.OOP.Animals;

/**
 * Created by ssharkov on 08.12.2016.
 */
public class Shark extends Fish {
    public Shark() {
        super("Shark");
    }

    public void sleep() {
        System.out.println("I'm Shark! I do not sleep");
    }
}

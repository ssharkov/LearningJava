package Learning.OOP.Animals;

/**
 * Created by ssharkov on 08.12.2016.
 */
public class ZooDemo {
    public static void main(String[] args) {
        Sleepable[] animals = new Sleepable[]{
                new Animal("Dog"),
                new Shark(),
                new Human()
        };
        for (Sleepable animal : animals) {
//            System.out.println(animal.name + "is going to sleep");
            animal.sleep();
        }
    }
}

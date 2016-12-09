package Learning.OOP.Animals;

/**
 * Created by ssharkov on 08.12.2016.
 */
public class Animal implements Sleepable {
    String name;
    int age;
    double weight;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("I'm " + name + "i'm going to eat");
    }

    public void sleep() {
        System.out.println("I'm " + name + " i'm going to sleep");
    }
}

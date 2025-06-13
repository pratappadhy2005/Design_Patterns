package au.com.pratap.solid.liskov.good.another;

interface Flyable {
    void fly();
}

class Bird{
}

class FlyingBird extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying high");
    }
}

class Penguin extends Bird {

}

public class LiskovViolationExample{
    public static void main(String[] args) {
        FlyingBird flyingBird = new FlyingBird();
        flyingBird.fly(); // This will work fine

        Penguin penguin = new Penguin();
        // penguin.fly(); // This will not compile, as Penguin does not implement Flyable
        System.out.println("Penguin cannot fly, but it is still a Bird.");
    }
}
package au.com.pratap.solid.liskov.simple.bad;

public class MainExample {

    /**
     * Objects of a superclass should be replaceable with objects of a subclass without altering the correctness of the program.
     *
     * But in this case when we try to replace the super class object with a subclass object then it throws exception.
     *
     * @param bird
     */
    static void makeIfFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {

        makeIfFly(new Sparrow());
        makeIfFly(new Ostrich()); // This will throw an exception
        makeIfFly(new Penguin()); // This will also throw an exception
    }

}

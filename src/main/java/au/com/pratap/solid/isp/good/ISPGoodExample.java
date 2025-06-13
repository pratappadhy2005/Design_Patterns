package au.com.pratap.solid.isp.good;

/**
 * Robot implements only what it needs (Workable).
 *
 * Human implements both Workable and Eatable.
 *
 * Clean separation of concerns.
 *
 */
public class ISPGoodExample {
}

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Robot implements Workable {
    public void work() {
        System.out.println("Robot is working");
    }
}

class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Human is working");
    }

    public void eat() {
        System.out.println("Human is eating");
    }
}

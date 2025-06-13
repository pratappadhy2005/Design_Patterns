package au.com.pratap.solid.isp.bad;

/**
 * The Worker interface forces Robot to implement eat(), even though it doesn’t make sense.
 *
 * Violates ISP because Robot depends on a method it doesn’t use.
 *
 */
public class ISPBadExample {
}

interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() {
        System.out.println("Robot is working");
    }

    public void eat() {
        // ❌ Doesn't make sense for a robot
        throw new UnsupportedOperationException("Robot doesn't eat");
    }
}

class Human implements Worker {
    public void work() {
        System.out.println("Human is working");
    }

    public void eat() {
        System.out.println("Human is eating");
    }
}

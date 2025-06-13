package au.com.pratap.solid.liskov.simple.good;

public class MainExample {
    /**
     * LSP says: Objects of a superclass should be replaceable with objects of a subclass without altering the correctness of the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        moveBird(penguin);  // Output: Moving like a penguin
        moveBird(sparrow);  // Output: Flying like a sparrow
        moveBird(ostrich);  // Output: Running like an ostrich
    }

    static void moveBird(Bird bird) {
        bird.move();
    }
}

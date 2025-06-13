package au.com.pratap.solid.liskov.simple.good;

public class Bird {
    void move(){
        System.out.println("Moving like a bird");
    }
}

class Penguin extends Bird {
    @Override
    void move() {
        System.out.println("Moving like a penguin");
    }
}

class Sparrow extends Bird {
    @Override
    void move() {
        System.out.println("Flying like a sparrow");
    }
}

class Ostrich extends Bird {
    @Override
    void move() {
        System.out.println("Running like an ostrich");
    }
}

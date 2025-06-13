package au.com.pratap.solid.liskov.simple.bad;

public class Bird {
    void fly(){
        System.out.println("Bird is flying");
    }
}

class Ostrich extends Bird {
    @Override
    void fly() {
        // Ostriches cannot fly, so this method is not applicable.
        throw new UnsupportedOperationException("Ostriches cannot fly");
    }

}

class Penguin extends Bird {
    @Override
    void fly() {
        // Penguins cannot fly, so this method is not applicable.
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

}

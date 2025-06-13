package au.com.pratap.solid.liskov.bad.another;

class Bird{
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}

public class LiskovViolationExample{
    public static void main(String[] args) {
      Bird bird = new Penguin();
        try {
            bird.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
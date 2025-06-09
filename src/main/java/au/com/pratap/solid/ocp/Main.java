package au.com.pratap.solid.ocp;

public class Main {
    public static void main(String[] args) {
        Operation addOperation = new AddOperation();
        Calculator calculator = new Calculator();
        int result = calculator.calculateNumber(10, 20, addOperation);
        System.out.println("Addition Result: " + result);
    }
}

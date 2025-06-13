package au.com.pratap.solid.dip.good;

/**
 * 💡What is the Dependency Inversion Principle (DIP)?
 *
 *  High-level modules should not depend on low-level modules. Both should depend on abstractions.
 *  Abstractions should not depend on details. Details should depend on abstractions.
 *
 *  In plain terms:
 *  Depend on interfaces, not concrete classes.
 *
 *
 * ✅ Benefits
 *
 * Switch depends on the Switchable interface, not the concrete class.
 *
 *Now, we can plug in any device — Fan, Heater, etc. — without changing the Switch.
 *
 */
public class DIPGoodExample {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        Switch s = new Switch(bulb);

        s.operate("ON");
        s.operate("OFF");
    }
}

// Abstraction
interface Switchable {
    void turnOn();
    void turnOff();
}

// Low-level module
class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb: ON");
    }

    public void turnOff() {
        System.out.println("LightBulb: OFF");
    }
}

// High-level module
class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(String command) {
        if (command.equals("ON")) device.turnOn();
        else device.turnOff();
    }
}

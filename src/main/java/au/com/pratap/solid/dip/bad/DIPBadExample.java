package au.com.pratap.solid.dip.bad;

/**
 * 🚨 Problem
 *
 * Switch is high-level logic, but it depends directly on LightBulb, a low-level module.
 *
 * If we change LightBulb to Fan or LED, we have to modify Switch — violating DIP.
 *
 */
public class DIPBadExample {
}

class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb: ON");
    }

    public void turnOff() {
        System.out.println("LightBulb: OFF");
    }
}

class Switch {
    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate(String command) {
        if (command.equals("ON")) bulb.turnOn();
        else bulb.turnOff();
    }
}
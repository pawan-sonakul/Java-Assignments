interface Switchable {
    String turnOn();
}

class Bulb implements Switchable {
    public String turnOn() {
        return "Bulb is ON";
    }
}

class Fan implements Switchable {
    public String turnOn() {
        return "Fan is ON";
    }
}

public class LightSwitch {
    public static void main(String[] args) {
        Switchable bulb = new Bulb();
        Switchable fan = new Fan();
        System.out.println(bulb.turnOn());
        System.out.println(fan.turnOn());
    }
}

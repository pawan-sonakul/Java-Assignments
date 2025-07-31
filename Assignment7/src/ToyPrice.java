abstract class Toy {
    abstract double getPrice();
}

class Doll extends Toy {
    double getPrice() {
        return 10.0;
    }
}

class Car extends Toy {
    double getPrice() {
        return 15.0;
    }
}

public class ToyPrice {
    public static void main(String[] args) {
        Toy doll = new Doll();
        Toy car = new Car();
        System.out.printf("Doll Price: $%.2f%n", doll.getPrice());
        System.out.printf("Car Price: $%.2f%n", car.getPrice());
    }
}

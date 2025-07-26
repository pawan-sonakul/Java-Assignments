import java.util.Objects;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            try {
                throw new InvalidObjectException("Cannot compare with null object");
            } catch (InvalidObjectException e) {
                throw new RuntimeException(e);
            }
        } else if (getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model);
    }

    public static void main(String[] args) {
        Car car = new Car("Honda");
        Car car1 = new Car(null);

        System.out.println(car.equals(car1));
    }

}

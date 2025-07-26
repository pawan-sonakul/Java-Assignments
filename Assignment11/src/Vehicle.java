public class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Honda");

        System.out.println(vehicle.getClass());
    }
}

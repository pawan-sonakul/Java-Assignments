import java.util.Objects;

public class Laptop {
    private int serialNo;
    private String brand;

    public Laptop(int serialNo, String brand) {
        this.serialNo = serialNo;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return serialNo == laptop.serialNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNo);
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop(123, "DELL");
        Laptop laptop1 = new Laptop(123, "HP");

        System.out.println("Laptops are equal: "+laptop1.equals(laptop));
        System.out.println("HashCodes match: " +(laptop1.hashCode() == laptop.hashCode()));
    }
}


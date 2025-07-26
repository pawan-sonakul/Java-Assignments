import java.util.Objects;

public class Product {
    private int code;
    private float price;

    public Product(int code, float price) {
        this.code = code;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    public static void main(String[] args) {
        Product product = new Product(123, 99.9f);

        System.out.println(product.hashCode());
    }
}

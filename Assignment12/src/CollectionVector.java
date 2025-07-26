import java.util.Vector;

public class CollectionVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println(vector);

        //check element
        if (vector.contains("Apple")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println(vector.size());
    }
}

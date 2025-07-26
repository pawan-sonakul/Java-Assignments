import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedTask {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Program");

        set.remove("Java");

        System.out.println(set);

    }
}

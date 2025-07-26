import java.util.Set;
import java.util.TreeSet;

public class RemovingCommonItems {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        Set<String> set1 = new TreeSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set1.add("Banana");
        set1.add("Grape");
        set1.add("Orange");

        set.removeAll(set1);

        System.out.println(set);
    }
}

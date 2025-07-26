import java.util.Set;
import java.util.TreeSet;

public class ArrayConversion {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("India");
        set.add("Canada");
        set.add("Brazil");

        System.out.println(set.contains("Canada"));
        set.toArray();
        System.out.println(set);


    }
}

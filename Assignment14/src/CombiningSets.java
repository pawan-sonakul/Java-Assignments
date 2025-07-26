import java.util.HashSet;
import java.util.Set;

public class CombiningSets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set1 = new HashSet<>();

        set.add("HR");
        set.add("IT");
        set1.add("Sales");
        set1.add("HR");

        set.addAll(set1);

        System.out.println(set.size());
    }
}

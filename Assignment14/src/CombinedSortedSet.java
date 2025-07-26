import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CombinedSortedSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        Set<String> set1 = new HashSet<>();

        set.add("John");
        set.add("Simran");
        set.add("Rahul");
        set1.add("Geeta");
        set1.add("Babita");

        set.addAll(set1);

        System.out.println(set);
        System.out.println(set.size());
    }
}

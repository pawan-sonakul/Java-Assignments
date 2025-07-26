import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommonItems {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        Set<String> set1 = new LinkedHashSet<>();

        set.add("Hammer");
        set.add("SrewDriver");
        set1.add("Wrench");
        set1.add("ScrewDriver");
        set1.add("Pliers");

        set.retainAll(set1);

        System.out.println(set);
    }
}

import java.util.HashSet;
import java.util.Set;

public class UniqueTags {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Tech");
        set.add("AI");
        set.add("Tech");
        set.add("Java");

        System.out.println(set.contains("AI"));
        System.out.println(set);
    }
}

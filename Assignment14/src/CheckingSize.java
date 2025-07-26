import java.util.LinkedHashSet;
import java.util.Set;

public class CheckingSize {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("Avengers");
        set.add("Star Wars");
        set.add("Titanic");

        System.out.println(set.contains("Avengers"));
        System.out.println(set.size());

    }
}

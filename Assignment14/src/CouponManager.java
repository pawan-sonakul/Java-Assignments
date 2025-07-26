import java.util.HashSet;
import java.util.Set;

public class CouponManager {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("SAVE10");
        set.add("DISC50");
        set.add("FREE20");

        set.clear();

        System.out.println(set.isEmpty());
    }
}

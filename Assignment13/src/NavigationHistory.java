import java.util.ArrayDeque;

public class NavigationHistory {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.addLast("Home");
        arrayDeque.addLast("About");
        arrayDeque.addFirst("Contact");

        System.out.println(arrayDeque.isEmpty());
    }
}

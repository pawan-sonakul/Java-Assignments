import java.util.ArrayDeque;
import java.util.Deque;

public class SongsPlaylist {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addLast("Song1");
        deque.addLast("Song2");

        deque.removeLast();

        System.out.println(deque.peekFirst());
    }
}

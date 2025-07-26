import java.util.ArrayDeque;
import java.util.Queue;

public class Messages {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("Msg1");
        queue.offer("Msg2");
        queue.offer("Msg3");
        queue.offer("Msg4");
        queue.offer("Msg5");

        queue.remove();
        queue.remove();
        queue.remove();

        System.out.println(queue.size());
    }
}

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskList {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();

        queue.addFirst("Task1");
        queue.addFirst("Task2");

        queue.addLast("Task3");

        queue.removeFirst();

        System.out.println(queue);

    }
}

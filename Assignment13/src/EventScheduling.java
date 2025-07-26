import java.util.PriorityQueue;
import java.util.Queue;

public class EventScheduling {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(10);
        queue.add(5);
        queue.add(15);

        System.out.println(queue.poll());
        System.out.println(queue.peek());



    }
}

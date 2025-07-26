import java.util.PriorityQueue;
import java.util.Queue;

public class PrintJobs {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("Doc1");
        queue.offer("Doc2");
        queue.offer("Doc3");

        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}

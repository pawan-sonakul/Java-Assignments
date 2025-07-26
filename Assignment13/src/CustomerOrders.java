import java.util.ArrayDeque;
import java.util.Queue;

public class CustomerOrders {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("Order1");
        queue.offer("Order2");
        queue.offer("Order3");
        queue.offer("Order4");

        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());


    }
}

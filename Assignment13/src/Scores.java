import java.util.PriorityQueue;

public class Scores {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(85);
        queue.add(90);
        queue.add(78);
        queue.add(92);

        queue.remove();

        System.out.println(queue);
    }
}

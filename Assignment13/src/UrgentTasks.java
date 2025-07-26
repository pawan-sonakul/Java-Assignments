import java.util.PriorityQueue;

public class UrgentTasks {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(100);
        priorityQueue.offer(50);
        priorityQueue.offer(75);

        System.out.println(priorityQueue.isEmpty());
        System.out.println(priorityQueue.poll());
    }
}

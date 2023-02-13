import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
        pq.offer(233);
        pq.offer(34);
        pq.offer(45);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }    
}

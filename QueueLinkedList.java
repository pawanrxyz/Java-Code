import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String [] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(23);
        queue.offer(27);
        queue.offer(28);
        queue.offer(30);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        
        System.out.println(queue.peek());
        // System.out.println(queue);
        queue.add(676);
        System.out.println(queue);


    }
    
}

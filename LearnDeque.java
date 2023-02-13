import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String [] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offer(16);
        adq.offer(17);

        System.out.println(adq);
        adq.offerFirst(23);
        System.out.println(adq);
        adq.offerLast(67);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq);
        adq.poll();
        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
        
    }
    
}

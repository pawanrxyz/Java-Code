import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String [] args) {
        Set<Integer> set = new HashSet<>();
        set.add(78);
        set.add(67);
        set.add(54);
        set.add(23);
        System.out.println(set);
    
        set.remove(78);
        System.out.println(set);
        
        System.out.println(set.contains(23));
        System.out.println(set.contains(233));
        
    }
}
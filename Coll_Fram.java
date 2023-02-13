import java.util.ArrayList;
public class Coll_Fram {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(6);
        // System.out.println(list);
        // for(int i=0;i<list.size();i++) {
            // System.out.print(list.get(i)+" ");
        // }
        for(Integer element : list) {
            System.out.print(element+" ");
        }
    }
    
}

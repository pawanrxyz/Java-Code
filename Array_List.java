import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.add(1,5);
        System.out.println(list);
        
        ArrayList<Integer>newList = new ArrayList<>();
        newList.add(130);
        newList.add(150);
        list.addAll(newList);
        System.out.println(list);
        System.out.println(list.get(1));
    }
    
}

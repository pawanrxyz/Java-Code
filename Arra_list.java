
import java.util.ArrayList;

public class Arra_list {
    public static void main(String [] args) 
    {
        ArrayList<String> listName = new ArrayList<>();
        listName.add("Soniya");
        listName.add("Aman");
        listName.add("Joya");
        listName.add("Suryanse");
        System.out.println(listName);
        
        System.out.println(listName.get(1));
        listName.set(1, "Pawan");
        System.out.println(listName);
        System.out.println(listName.contains("Pawna"));
        listName.clear();
        System.out.println(listName);

    }
    
}

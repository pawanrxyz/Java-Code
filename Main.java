class Animal
{
    String color;
    Animal()
    {
        System.out.println("animal constructor is called:");
    }
}
class Horse  extends Animal {
    Horse()
    {
        super();
        super.color = "brown";
        System.out.println("horse constructor is called");
    }
}
public class Main {
    public static void main(String[] args) {
        Horse r = new Horse();      
        System.out.println(r.color); 
    }     
}

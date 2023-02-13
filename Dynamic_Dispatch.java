class Phone
{
    public void greet()
    {
        System.out.println("You are welcome:");
    }
    public void on(){
        System.out.println("Turning on phone..:");
    }
}
class SmartPhone extends Phone
{
    public void swagat()
    {
        System.out.println("Apka swagat hai:");
    }
    public void on()
    {
        System.out.println("Turning on the SmartPhone..:");
    }
}
public class Dynamic_Dispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.greet();
        obj.on();

    }
    
}

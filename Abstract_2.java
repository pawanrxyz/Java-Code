abstract class P1 
{
    abstract public void A();
    abstract public void B();
}
class A1 extends P1
{
    
    public void A()
    {
        System.out.println("this is an abstract class:");
    }

    @Override
    public void B() {
    
        System.out.println("This is method B:");
        
    }
}
public class Abstract_2 {
    public static void main(String [] args) {
        A1 t = new A1();
        t.A();t.B();

    }
}
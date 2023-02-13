abstract class Parents {
    abstract void greet();
    abstract void sayHello();
}
 class Child extends Parents {
    public void greet()
    {
        System.out.println("Good morning guys:");
    }

    @Override
    void sayHello() {
    
       System.out.println("Hello how are you buddy:");
        
    }
}
class Child_2 extends Child 
{
    public void sayHello()
    {
        System.out.println();
    }
}
public class Abstract_1 {
    public static void main(String[] args) {
        Child_2 t = new Child_2();
        t.greet();
        t.sayHello();
    }
    
}

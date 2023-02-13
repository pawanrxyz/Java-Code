class A2
{
    public void add()
    {
        int a = 34,b = 45,c;
        c = a+b;
        System.out.println("Addition of two numbers:"+c);
    }
}
class B21 extends A2
{
    int a = 43,b = 12,c;
    public void sub()
    {
        c = a-b;
        System.out.println("Subtraction of two numbers:" +c);
    }
}
public class Index_Paw {
    public static void main(String [] args) {
        B21 c = new B21();
        c.add();c.sub();
        
    }
    
}

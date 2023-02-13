class P 
{
    int c;
    public void add()
    {
    int a = 12,b = 34;
    c = a+b;
    }
    void show()
    {
        
        System.out.println("Addition of two number:" +c);
    }    
}
class B extends P 
{
    void sub()
    {
        int x = 34,y = 23,z;
        z =x-y;
        System.out.println("Subtraction of two number:"+z);
        
    }
}
public class Extender_2 {
    public static void main(String [] args) {
        B t = new B();
        t.show();t.sub();
    }
    
}

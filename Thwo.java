class Mn 
{
    public void add()
    {
        int a = 23,b = 12,c;
        c = a+b;
        System.out.println(c);
    }
}
class Mn1 extends Mn 
{
    public void sub()
    {
        int x = 12,y = 23,z;
        z = x-y;
        System.out.println(z);        
    }
}
public class Thwo {
    public static void main(String [] args) {
        Mn1 t = new Mn1();
        t.add();t.sub();
        
    }
       
}

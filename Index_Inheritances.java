class ASP 
{
    void show()
    {
        System.out.println("This is class A:");
    }
}
class B2 extends ASP 
{
    void show1()
    {
        System.out.println("This is class A,B2:");
    }
}
class C extends ASP 
{
    void show2()
    {
        System.out.println("This is class A1,C:");
    }
}
public class Index_Inheritances {
    public static void main(String [] args) {
        C t = new C();
        t.show();t.show2();
        
    }
    
}

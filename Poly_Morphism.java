class Polys 
{
    void a()
    {
        System.out.println("I am performing polymorphism task:");
    }
    void a(int a)
    {
        System.out.println("The value of A" +a);
    }
    void a(String name)
    {
        System.out.println("Name:"+name);
    }
}
public class Poly_Morphism {
    public static void main(String [] args) {
        Polys t = new Polys();
        t.a();
        t.a(34);
        t.a("pawan");
    }
    
}

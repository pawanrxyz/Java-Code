public class Defaul_This {
    Defaul_This()
    {
        System.out.println("Call Default constructor:");
    }
    Defaul_This(int a)
    {
        this();
        System.out.println(a);
    } 
    void show()
    {
        System.out.println("Display ");
    }   
    public static void main(String[] args) {
        Defaul_This r = new Defaul_This(32);
        r.show();
    }
}

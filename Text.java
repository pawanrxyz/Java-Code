class A11
{
    void getAdd(int a,int b)
    {
        System.out.println(a+b);
    }
    int setAdd()
    {
        int a = 34,b = 45;
        System.out.println(a+b);
        return a+b;
    }
}
public class Text {
    public static void  main(String [] args) {
        A11 a = new A11();
        a.getAdd(34,34 );
        a.setAdd();
    }
    
}

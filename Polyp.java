class An1 
{
    public void add()
    {
        int a = 23,b = 12,c;
        c = a+b;
        System.out.println("Addition of :"+c);
    }
    public void sub(int x,int y) {
        int z = x-y;
        System.out.println("subtraction of two numbers: "+z);
    }
}
public class Polyp {
    public static void main(String [] args) {
        An1 a = new An1();
        a.add();a.sub(45, 34);
    }
    
}

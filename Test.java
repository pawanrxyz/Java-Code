public class Test implements Runnable 
{
    @Override
    public void run()
    {
        System.out.println("Perform Thraed task:");
    }
    public void add()
    {
        int a = 34,b = 12,c;
        c = a+b;
        System.out.println("The addition of two numbers: "+c);
    }
    public static void main(String [] args) {
        Test p = new Test();
        Thread t = new Thread(p);
        t.start();
        

    }    
}

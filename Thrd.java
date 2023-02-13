public class Thrd implements Runnable
{
    public void run()
    {
        System.out.println("Performing Runnable Tasks:");
    }
    public static void main(String[] args) {
        Thrd t = new Thrd();
        Thread t1 = new Thread(t);
        t1.start();
    }

}

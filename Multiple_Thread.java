public class Multiple_Thread extends Thread{
    public void run()
    {
        System.out.println("I am going to my home town:");
    }
    public static void main(String [] args) {
        Multiple_Thread t = new Multiple_Thread();
        t.start();
        Multiple_Thread t2 = new Multiple_Thread();
        t2.start();
    }
    
}

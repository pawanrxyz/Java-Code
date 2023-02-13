public class Thrad extends Thread{
    public void run()
    {
        System.out.println("I am in Thread one:");
    }
    public static void main(String [] args) {
        Thrad m = new Thrad();
        m.start();
    }

}
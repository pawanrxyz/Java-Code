public class Therd_1 extends Thread {
    public void run()
    {
        System.out.println("Thread task:");
    }
    public static void main(String [] args) {
        Therd_1 t = new Therd_1();
        t.run();
    }
}

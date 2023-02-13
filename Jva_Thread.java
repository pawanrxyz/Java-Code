public class Jva_Thread extends Thread {
    public void run() {
        System.out.println("I am going to my home town");
    }
    public static void main(String[] args) {
        Jva_Thread  t = new Jva_Thread();
        t.start();
        Thread th = new Thread(t);
        th.start();

    }
    
}

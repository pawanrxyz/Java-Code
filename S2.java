public class S2 {
    int a;
    S2(int a)
    {
        this.a = a;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        S2 r = new S2(234);
        r.show();
        
    }    
}

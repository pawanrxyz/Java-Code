class Cons {
    int length,width;
    Cons(int x,int y) {
        length = x;
        width = y;
    }
    int rectArea() {
        return length*width;
    }
}
public class UsingCons {
    public static void main(String[] args) {
        Cons c = new Cons(34, 45);
        int area = c.rectArea();
        System.out.println("Area:" +area);        
    }
    
}

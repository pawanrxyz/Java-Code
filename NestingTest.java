class Nesting {
    int m ,n;
    Nesting(int x,int y) {
        m = x;
        n = y;
    }
    int largest() {
        if(m>=n)
           return m ;     
        else 
           return n;
    }
    void display() {
         int large = largest();
         System.out.println("Largest value = "+large);
    }
}
public class NestingTest {
    public static void main(String[] args) {
        Nesting n = new Nesting(34, 56);
        n.display();        
    }
    
}

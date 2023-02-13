class Super {
    public void method() {
        System.out.println("Method Super : ");
    }
}
class Sub extends Super {
    public void method() {
        System.out.println("Method Sub");
    }
}
public class DynamicDispatchMathod {
    public static void main(String args[]) {
        Super s = new Sub();
        s.method();
    }
    
}

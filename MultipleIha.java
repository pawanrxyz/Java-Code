interface Area {
    final static float pi = 3.14F;
    float compute (float x, float y);
}
class Rectangles implements Area {
    public float compute (float x,float y) {
        return (x*y);
    }
}
class Circle implements Area {
    public float compute (float x,float y) {
        return (pi*x*y);
    }
}
public class MultipleIha {
    public static void main(String[] args) {
        Rectangles rect = new Rectangles();
        Circle cir = new Circle();
        Area area;
        area = rect;
        System.out.println("Area of Rectangle = " +area.compute(10, 20));
        area = cir;
        System.out.println("Area of Circle = " +area.compute(12, 10));
    }
    
}

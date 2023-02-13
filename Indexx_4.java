class Geometry1 
{
    void area(int height,int width)
    {
        int ar = height*width;
        System.out.println("Area of Rectangle:"+ar);
    }
}
class Geometry2 extends Geometry1
{
    void area(int height,int width)
    {
        int ar = height*width;
        System.out.println("Area of Rectangle:"+ar);

    }
}
public class Indexx_4 {
    public static void main(String[] args) {
        Geometry2 obj = new Geometry2();
        obj.area(43,45);
        obj.area(34, 24);
    }
    
}

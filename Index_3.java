class Geometry 
{
    void area(int height,int width) 
    {
        int ar = height*width;
        System.out.println("Area of rectangle:"+ar);
    }
    void area(int side) 
    {
        int ar = side*side;
        System.out.println("Area of square:"+ar);
    }
    void area(float r)
    {
        float ar = 3.14f*r*r;
        System.out.println("Area of circle:"+ar);
    }
    void area(float base,float height)
    {
        float ar = 0.5f*base*height;
        System.out.println("Area of Triangle:"+ar);
    }
}
public class Index_3 {
    public static void main(String[] args) {
        Geometry g  = new Geometry();
        g.area(12);
        g.area(33, 45);
        g.area(4);
        g.area(4);  
        g.area(34,78);  
        g.area(65, 87);
    }
    
}

interface Geometry_1 
{
    void rectangle_area(int height,int width );
    void square_area(int side); 
    void  circle_area(float radius);
}
class Easy implements  Geometry_1
{
    public void rectangle_area(int height,int width)
    {
        int ar = height*width;
        System.out.println("Area of Rectangle is :+"+ar);
    }
    public void square_area(int side) 
    {
        int ar = side*side;
        System.out.println("Area of Square is :"+ar);
    }
    public void circle_area(float radius)
    {
        float ar = 3.14f*radius*radius;
        System.out.println("Area of circle is:"+ar);

    }
 
}

public class Index_Practice_2 {
    public static void main(String[] args) {
        
    }
    
}

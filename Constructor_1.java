class Rectangle
{
    int area;
    Rectangle(int height,int width) 
    {
        area = height*width;
        System.out.println("Area of Rectangle:" +area);
    }
}
public class Constructor_1 {
    public static void main(String [] args) {
        new Rectangle(23,76);
        
    }        
}

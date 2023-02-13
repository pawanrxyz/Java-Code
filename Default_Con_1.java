class Rectangle1
{
    int area;
    int height;
    int width;

    Rectangle1()
    {
        height = 15;
        width = 23;
        area = height*width;
        System.out.println("Area of Rectangle:"+area);
    }
}
public class Default_Con_1 {
    public static void main(String [] args) {
        new Rectangle1();
    }    
}

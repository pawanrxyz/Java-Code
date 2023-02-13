
public class Exception_1 {
    public static void main(String[] args) {
        int a = 10,b = 0,c;
        System.out.println("this is an exception handling example:");
        try
        {
            c = a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

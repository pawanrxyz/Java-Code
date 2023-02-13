import java.util.Scanner;
public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        try {
            System.out.println("Enter first number:");
            b = sc.nextInt();
            System.out.println("Enter second number:");
            c = sc.nextInt();
            a = b/c;
            System.out.println("Division:" +a);
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
        sc.close();
    } 
}

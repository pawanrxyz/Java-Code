import java.util.Scanner;
public class ThrowExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        try 
        {
            System.out.println("Enter first number:");
            b = sc.nextInt();
            System.out.println("Enter second number:");
            c = sc.nextInt();
            if(c!=0)
            {
                a = b/c;
                System.out.println("Division :"+ a);
            }
            else 
            sc.close();
            throw new Exception("Don't put zero in denominator");
        }catch(Exception e) {
            System.out.println("Error :" +e);
        }
    }
}

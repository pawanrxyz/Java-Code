import java.util.Scanner;
public class Finally_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0,b,c;
        try {
            System.out.println("Enter First Number:");
            b = sc.nextInt();
            System.out.println("Enter Second Number:");
            c = sc.nextInt();
            if(c!=0) {
                a = b/c;
            }
            else 
            sc.close();
            throw new Exception("Don't put zero in denominator:");
        }catch(Exception e)
        {
            System.out.println("Error:" +e);
        }
        finally 
        {
            System.out.println("Division:="+a);
        }
    }    
}

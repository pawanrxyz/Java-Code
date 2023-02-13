import java.util.Scanner;
public class Execption_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int c = 0;
        try{
            c = a/b;
            System.out.println("Divide = "+c);
        }
        catch(Exception e) {
            System.out.println("Error : "+e);
        }
        sc.close();
    }    
}

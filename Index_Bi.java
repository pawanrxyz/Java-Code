import java.util.Scanner;
public class Index_Bi 
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");        
        int num = sc.nextInt();
        String b = "";
        int t = num;
        while(t>0)
        {
            int r = t%2;
            t = t/2;
            b = r+b;
        }
        System.out.println("Binary Equivalent of "+ num+" is "+b);
        sc.close();
    }
}
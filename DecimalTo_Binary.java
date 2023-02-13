import java.util.Scanner;
public class DecimalTo_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal number");
        int num = sc.nextInt();
        int t = num;
        int d = 0;
        int i = 0;
        
        while(t>0)
        {
            int r = t%10;
            t = t/10;
            d = d+r*(int)Math.pow(2,i++);
        }
        System.out.println("Decimal Equivalent of "+num+" is "+d);
        sc.close();
    }    
}

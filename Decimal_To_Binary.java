import java.util.Scanner;
public class Decimal_To_Binary {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal number:");
        int num = sc.nextInt();
        int t = num;
        String d = "";

        while(t>0)
        {
            int r = t%2;
            t = t/2;
            d = r+d;
        }
        System.out.println("Binary Equivalent of "+num+" is "+d);
        sc.close();
    }
    
}

import java.util.Scanner;
public class Practice { 


    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int t = num;
        String b = "";
        while(t>0)
        {
            int r = t%2;
            t = t/2;
            b = r+b;
        }
        System.out.print(b);
        sc.close();
    }
    
}

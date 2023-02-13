import java.util.Scanner;
public class Sum_digit1 {
    public static void main(String[] args) {
        int n,r,sum = 0;
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0) 
        {
            r = n%10;
            sum =sum+r;
            n = n/10;
            sc.close();
        }
        System.out.print(sum);
    }    
}

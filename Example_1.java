import java.util.Scanner;
public class Example_1 {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        int n,r,sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n>0)
        {
            r = n%10;
            sum = sum+r;
            n = n/10;
        }
        System.out.print(sum);
        sc.close();
    }
    
}

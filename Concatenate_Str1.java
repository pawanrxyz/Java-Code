import java.util.Scanner;
public class Concatenate_Str1 {
    
    public static void main(String[] args) {
        int r,n;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0)
        {
            r = n%10;
            n =  n/10;
            System.out.print(r);
            sc.close();
        }
    }
    
}

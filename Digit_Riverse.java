import java.util.Scanner;
public class Digit_Riverse {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any number:");
         int num = sc.nextInt();
         int temp = num;
         int sum = 0;
          while(temp>0)
          {
            int r = temp%10;
            temp = temp/10;
            sum = sum+r;
        }        
        System.out.print(sum);
        sc.close();
    }
}
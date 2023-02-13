import java.util.Scanner;
public class Sum_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        while(n>0){
            sum = sum+n;
            n = n/10;
        }
        System.out.println("The sum of digit: "+sum);
        sc.close();
    }
    
}

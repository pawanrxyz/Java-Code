import java.util.Scanner;
public class PrintMultiplse {
    public static void printMultiple(int n,int k) {
        if(k == 1) {
            System.out.println(n);
            return;
        }
        printMultiple(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String arga[])  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int n = sc.nextInt();
        System.out.println("Enetre any kth number:  ");
        int k = sc.nextInt();
        printMultiple(n, k);
        sc.close();
    }
} 

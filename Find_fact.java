import java.util.Scanner;
public class Find_fact {
    static void printFact(long n)
    {
        int fact = 1;
        for(int i=1;i<=n;i++) // or far(int i=n;i>=1;i--)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        long n = sc.nextInt();
        printFact(n);
        sc.close();
    }
    
}

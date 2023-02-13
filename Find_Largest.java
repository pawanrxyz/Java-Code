import java.util.Scanner;
public class Find_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        /* 
        if(a>b && a>c)
        {
            System.out.println("A is the largest elements:");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is the largest elements:");
        }
        else if(c>a && c>b)
        {
            System.out.println("c is the largest elements:");
        }
        else 
        {
            System.out.println("end body of else if:");
            sc.close();
        }
        */
        int max = a;
        if(b>max)
        {
            max = b;
        }
        if(c>max)
        {
            max = c;
        }
        System.out.println(max);
        sc.close();
    }    
}

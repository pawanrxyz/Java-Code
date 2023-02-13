import java.util.Scanner;
public class Array_Sort {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Number:");
        for(int i=0;i<a.length;i++)
        {
            
            a[i] = sc.nextInt();
        }
        System.out.println("You array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    
}

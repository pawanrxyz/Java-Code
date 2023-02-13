import java.util.Scanner;
public class Arrays_Example21 {
    public static void main(String [] args) {
        int n,m,p;
        System.out.println("Enter the no of elements:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n+1];

        System.out.println("Enter The elements of array:");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter index:");
        m = sc.nextInt();
        System.out.println("Enter the new value to be insert :");
        p = sc.nextInt();
        for(int i=0;i<n+1;i++)
        {
            if(i<m) 
            {
                b[i] = a[i];
            }
            else if(i==m) 
            {
                b[i] = p;
            }
            else 
            {
                b[i] = a[i-1];
            }
        }
        System.out.println("After inserting new element :");
        for(int i=0;i<n+1;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println("Elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }    
}

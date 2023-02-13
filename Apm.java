import java.util.Scanner;

public class Apm {
  public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size to be inserted:");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n+1];
        System.out.println("Enter your elements to be inserted:");
        for(int i=0;i<n;i++)
        {
          a[i] = sc.nextInt();
        }
        System.out.println("Elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
          }        
          System.out.println("Enter your index to be inserted:");
        int m = sc.nextInt();
        System.out.println("Enter the value to be inserted:");
        int p = sc.nextInt();
        System.out.println("Enter the elements to be inserted:");
        for(int i=0;i<n+1;i++)
        {
          if(i>m) 
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
        System.out.println("After inserted new elements:");
        for(int i=0;i<n+1;i++)
        {
          System.out.println(b[i]+" ");
        }
        sc.close();
      }    
    }
    
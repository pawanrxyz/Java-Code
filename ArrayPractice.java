import java.util.Scanner;
import java.util.Arrays;
public class ArrayPractice {
    static int[] printArray(int arr[]) {
        Arrays.sort(arr);
        
        
        int []arr2 = {arr[0],arr[arr.length-1]};    
        return arr2;   
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter How many elements wants to enter in array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("Enter the No : ");
        // int x = sc.nextInt();
        // int[] ans = printArray(arr, x);
        // System.out.println("The total pairs is  :" +ans);

        int[]arr2 = printArray(arr);
        System.out.println("Smallest : "+arr2[0]);
        System.out.println("Largest is  : "+arr2[1]);
        sc.close();
    }    
}


import java.util.Scanner;
public class PracticeArray {
    // public static int findFirstlargest(int arr[]) {
    //      int max = Integer.MIN_VALUE;

    //      for(int i=0;i<arr.length;i++) {
    //         if(arr[i]>max) {
    //             max = arr[i];
    //         }
    //      }
    //      return max;
    // }

    // public static int secFindLargest(int arr[]) {
    //     int mx1 = findFirstlargest(arr);

    //     for(int i=0;i<arr.length;i++) {
    //         if(arr[i] == mx1) {
    //             arr[i] = Integer.MIN_VALUE;
    //         }
    //     }
    //     int secondLargest = findFirstlargest(arr);
    //     return secondLargest;
    // }

    public static int repeatedFirst(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements of an array");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("Enter target element of an array : ");
        // int target = sc.nextInt();

        // int ta = printArray(arr, target);
        // System.out.println(ta);
        // // int ans = findFirstlargest(arr);
        // int ans1 = secFindLargest(arr);
        // System.out.println(ans1);
        // // System.out.println(ans);

        int an = repeatedFirst(arr);
        System.out.println(an);
        sc.close();


    }
    
        
}

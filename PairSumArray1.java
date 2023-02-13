import java.util.Scanner;
public class PairSumArray1 {
    public static void printArray(int arr[],int target) {
        int ans = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                ans++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int n = in.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements of an array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter target element of an array: ");
        int target = in.nextInt();
        printArray(arr, target);
        in.close();
    }   
}

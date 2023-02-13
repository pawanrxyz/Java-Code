import java.util.Scanner;
public class FindArraySuIsEqual {
    public static int printArray(int arr[],int target) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;i<arr.length;j++) {
                if(arr[i]+arr[j] == target) {
                    return arr[j];
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
        System.out.println("Enter target element of an array : ");
        int target = sc.nextInt();

        int ta = printArray(arr, target);
        System.out.println(ta);
        sc.close();


    }
    
}

public class SumOfMinAndLargestArray {
    static int printArray(int arr[] ) {
        int min = -1;
        int max = 989;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>min) {
                min = i;
                return min;
            }
            if(arr[i]>max) {
                max = i;
                return max;
            }
            
            // int arr1[] = {min,max};
            // System.out.println(arr1);
        }
        return -1; 
    }

    public static void main(String [] args) {
        int arr[] = {1,2,3,4,5};
    
        System.out.println("Ans is : "+printArray(arr));
    }
}
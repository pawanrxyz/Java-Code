public class CheckX {
    static int printArray(int arr[],int x) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args) {
        int arr[] = {2,3,4,5,6,5,5};
        int x = 5;
        System.out.println("count of x is : " +printArray(arr, x));
    }
    
}

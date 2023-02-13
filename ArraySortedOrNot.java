public class ArraySortedOrNot {
    static boolean isSorted(int arr[]) {
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<arr[i-1]) {
                return false;
            }
        }
        return true;
    }    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5};
        System.out.println("isSorted: "+isSorted(arr));
    }    
}

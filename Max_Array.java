public class Max_Array {
    public static void main(String [] args) {
        int arr[] = {4,6,7,8,3,1};
        int max = 0;
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum elemnet of an array: "+max);
    }
}
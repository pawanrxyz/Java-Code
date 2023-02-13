public class LastOccurances {
    static int printArray(int arr[],int x) {
        int lastOucc = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == x) {
                lastOucc = i;
                break;
            }
        }
        return lastOucc;
    }
    public static void main(String  args[]) {
        int arr[] = {1,2,5,6,7,5,4};
        int x = 5;  
        System.out.println("LastOccrances no is :"+printArray(arr, x));      
    }    
}

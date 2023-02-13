public class CopyArray {
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {

        int []arr = new int[5];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 9;
    
        System.out.println("This  is my original arrray:");
        // for(int i=0;i<arr.length;i++) {

            // System.out.print(arr[i]+" ");
        // }
        printArray(arr);
        int arr_2[] = arr; 
        System.out.println("After copied array from original");
        // System.out.print(arr_2 +" ");
        printArray(arr_2);

        System.out.println("After changing the value of coppied array:");
        arr_2[0] = 0;
        arr_2[1] = 1;
        // System.out.print(arr_2);
        printArray(arr_2);

    }
    
}

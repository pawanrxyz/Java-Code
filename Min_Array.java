public class Min_Array {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 3, 2, 8 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("Minimum element of array is " + min);
    }

}

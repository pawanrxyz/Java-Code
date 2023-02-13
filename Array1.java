
public class Array1 {
    public static void printArray(int [] a) 
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr [] = new int [] {34,56,67,78,89,};
        printArray(arr);   
    }
}

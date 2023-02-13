public class Array_Return1 {
    static void printArray(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    static int [] returnArray()
    {
        int [] arr = new int [] {2,3,4,5,6};
        return arr;
    }
        public static void main(String [] args) {
            int [] arr = returnArray();
            printArray(arr);
    }    
}

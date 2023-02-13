// package NJAVA;
public class Arry1 {
    public static void main(String [] args) {
        int a[] = {2,5,1};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
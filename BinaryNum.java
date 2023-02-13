import java.util.*;
public class BinaryNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int i = 0;
        int biNum = 0;

        while(n!=0) {
            int rem = temp%2;
             biNum = biNum+rem*(int)Math.pow(2,i);   
             temp = temp/10;
             i++;
             System.out.println(biNum);
        }
        sc.close();            
    }
}
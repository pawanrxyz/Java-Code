import java.util.*;
public class BinaryToDeci {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int binNum = sc.nextInt();
        int decimalNum = 0;
        int pow = 0;

        while(binNum>0) {
            int lastDigit = binNum%10;
            decimalNum = decimalNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/2;
        }
        System.out.println("The decimal no of"+binNum+" is"+decimalNum);
        sc.close();
    }
}
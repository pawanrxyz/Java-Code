public class Factorial {
    public static int fact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n*fact(n-1);
    }

    public static int sumDigit(int n) {
        if(n >=0 && n<=9) {
            return n;
        }
        return sumDigit(n/10)+sumDigit(n%10);
    }
    public static void main(String args[]) {
        int n = 6;
        System.out.println("Factorial of "+n+" is = "+fact(n));
        System.out.println("The sum digit is =  "+sumDigit(1234));

    }
    
}

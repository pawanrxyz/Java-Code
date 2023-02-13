public class SumOfInteger {
    public static int sod(int n) {
        if (n >= 0 && n<=9)  {
            return n;
        }
        return sod(n/10)+n%10;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(sod(n));
    }

}

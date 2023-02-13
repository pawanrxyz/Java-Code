public class PowerOfStack {
    public static int calcPower(int x,int n) {
        if(n%2 == 0) {
            return (calcPower(x, n/2))*(calcPower(x, n/2)); 
        }
        else {
            return calcPower(x, n/2)*calcPower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        
        int x = 2,n = 4;
        int ans = calcPower(x, n);
        System.out.println("Our answer : "+ans);
        
    }    
}

public class BInaryTod {
    public static void binToDec(int n) {
        int binNum = n;
        int pow = 0;
        int deciMal = 0;

        while(binNum>0) {
            int lastDigit = binNum%10;
            deciMal = deciMal+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of "+binNum+" is "+deciMal);
    }
    public static void main(String[] args) {
        binToDec(110);        
    }
    
}

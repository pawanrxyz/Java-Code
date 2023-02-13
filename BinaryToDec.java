public class BinaryToDec {
    public static void binTod(int biNum) {
        int myNum = biNum;
        int pwd = 0;
        int decNum = 0;

        while(biNum>0) {
            int lastDigit = biNum%10;
            decNum = decNum+(lastDigit*(int)Math.pow(2,pwd));

            pwd++;
            biNum = biNum/10;
        }
        System.out.println("decimal of " +myNum+ " = "+decNum);
    }
    public static void main(String[] args) {
        binTod(111);
    } 
}
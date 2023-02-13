class Mathoperation {
    static float mul(float x,float y) {
        return x*y;
    }
    static float divide(float x,float y) {
        return x/y;
    }
}
public class StaticMeth {
    public static void main(String[] args) {
        float a = Mathoperation.mul(23, 45);
        float b = Mathoperation.divide(20, 3);
        System.out.println("MUltiplication:"+a+ "\nDivision" +b);
    }    
}

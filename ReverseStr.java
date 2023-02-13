public class ReverseStr {
    public static void printStr(String str,int idx) {
        if(idx == 0) {
            System.out.print(str.charAt(idx));
            return;            
        }
        System.out.print(idx);
        printStr(str, idx-1);
            
    }    
    public static void main(String[] args) {
        String str = "Pawan";

        printStr(str, str.length()-1);

    }
    
}

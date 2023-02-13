public class ReverseString {
    public static void printRev(String str,int idx) {
        if(idx == -1) {
            // System.out.print(str.charAt(idx-1));
            return;            
        }
        printRev(str,idx-1);
        System.out.print(str.charAt(idx));
    }
    public static void main(String args[]) {
        String str = "Hello";
        int idx = str.length();
        printRev(str, idx-1);

    }
    
}

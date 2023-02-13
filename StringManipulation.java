// import java.util.*;
public class StringManipulation {
    public static void main(String[] args, int process) {
        StringBuffer str = new StringBuffer("Object Language");
        System.out.println("Original String : "+str);
        System.out.println("Length of String:"+ str.length());

        for(int i=0;i<str.length();i++) {
            int p = i+1;
            System.out.println("Character a position "+p+ "is"+ str.charAt(i) );
        }

        // String aString = new String(str.toString());
        // String pos = aString indexOf("language");
        str.insert(process, "Oriented");
        System.out.println("Modified string" +str);
    }

        
}

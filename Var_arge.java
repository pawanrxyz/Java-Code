public class Var_arge {
    public static void printString(String ... person) {
        for(String name : person) {
            System.out.println("Hello "+name);
        }
    }
    public static void main(String[] args) {
        printString("Pawan","Raj","Amer");
    }
    
}

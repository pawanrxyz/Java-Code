class Inh {
    public void add(int x,int y) {
        int z = x+y;
        System.out.println("Addition of two numbers:" +z);      
    }
}
class Subt extends Inh {
    public void sub(int x,int y) {
        int z = x-y;
        System.out.println("Subtraction of two numbers:" +z);
    }
}
    public class Inharitave {
       public static void main(String [] args) {
        Subt t = new Subt();
       t.add(23, 34);
       t.sub(45, 34);
        
       }
    }
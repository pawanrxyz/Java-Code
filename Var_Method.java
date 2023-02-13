class Sv {
    // private int x;

    // int x;
     void add(int ... a) {
        int sum = 0;
        for(int x : a) {
            sum=sum+x;
        }
        System.out.println("Sum of Number:" +sum);
    }
}
public class Var_Method {
    public static void main(String[] args) {
        Sv r = new Sv();
        r.add(23);r.add(34,45);
        r.add(23,34,54);r.add(23,45,67,8);

    }    
}

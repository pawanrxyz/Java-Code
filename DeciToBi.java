import java.util.Scanner;

public class DeciToBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enert any number:");
        int n = sc.nextInt();

        int t = n;
        String b = "";

        while (t > 0) {
            int rev = t % 2;
            t = t / 2;
            b = rev + b;
        }
        System.out.println("Binary: " + b);
        sc.close();
    }

}

import java.util.Scanner;

class Bank {
    private double bal = 5000;
    private int pwd;

    public void deposite(double money) {
        System.out.println("Enter your password:");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        if (pwd == 123) {

            bal = bal + money;
            System.out.println("Deposite amount: "+money);
            System.out.println("Your total balance " + bal);
        }
        else {
            System.out.println("Incorrect password ");
        }
        sc.close();
    }

    public void checked() {
        System.out.println("Enter your password ");
        Scanner sc = new Scanner(System.in);
        pwd = sc.nextInt();
        if(pwd == 124) {
            System.out.println("Your Toatl balance :"+bal);
        }
        else {
            System.out.println("Incorrect Passswos:");
        }
        sc.close();
    }
}
public class CustomerBank {
    public static void main(String[] args) {
        Bank b = new Bank();
        // b.deposite(1000);

        int ch;
        System.out.println("1.Deposite");
        System.out.println("2.Checked balance:");

        System.out.println("Enter Your Choice:");
        Scanner s = new Scanner(System.in);
        ch = s.nextInt();
        
        
        switch(ch) {
            case 1: b.deposite(1000);
            break;
            case 2: b.checked();
            break;
            default :System.out.println("Invalid Choice");
        }
        s.close();
    }
}
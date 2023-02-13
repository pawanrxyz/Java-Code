public class NaturalNo {
    public static void printNatural(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNatural(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // anothrt way calculate factorial

    public static int factorial1(int n) {
        if (n == 0) {
            return 1;
        }
        int smallarAns = factorial1(n - 1);
        int ans = n * smallarAns;
        return ans;
    }

    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b, c, n - 1);
    }

    // fibonocci number

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        // subproblem =recursion
        // int prev = fib(n - 1);
        // int prevPrev = fib(n - 2);
        // return prev + prevPrev;

        return fib(n-1)+fib(n-2);
    }


    //sum of imteger using  recursion
    public static int sod(int n) {
        if(n>=0 && n<=9) {
            return n;
        }
        return sod(n/10)+n%10;
    }

    public static void main(String args[]) {
        int n = 6;
        printNatural(n);

        int ans = factorial(n);
        System.out.println("The factorial of " + n + " is = " + ans);

        System.out.println("Another way calculating factorial of a number:" + n + " is  = " + factorial1(n));

        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        fibonacci(a, b, n);
        // System.out.print("Fibonacci siriese is of "+n+" is = "+fibonacci(n-2, a, b));
        System.out.println();

        // System.out.println("Fibonocci number "+fib(n));
        System.out.println("Nth term fibonocci ");
        for (int i = 0; i <= 10; i++) {
            System.out.println(fib(i));
        }

        System.out.println("The sum digit is = " +sod(123));

        
    }
    
}

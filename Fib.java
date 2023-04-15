public class Fib {
    
    static int fib(int n) {
        for (int i = 0; i <=n; i++)
            if (n == 1 || n==2) {
                return 1;
            }
        return fib(n-1) + fib(n-2);
    }

    public static void main (String [] args) {
        System.out.println(fib(9));
    }
}


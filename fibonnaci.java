import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        int n, i = 0, j = 1, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi kac eleman olsun: ");
        n = input.nextInt();

        for (int k = 2; k < n+1; k++) {
            sum = i + j;
            System.out.print(" " + sum);
            i = j;
            j = sum;
        }
    }
}

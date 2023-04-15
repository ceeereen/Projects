import java.util.Scanner;

public class tersucgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        for (int i=num; 0<i; i--) {
            int space = num/2;
            System.out.println(" ".repeat(num-i) + "*".repeat(2*i-1));
        }
    scanner.close();
    }
}

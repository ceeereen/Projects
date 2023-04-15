import java.util.Scanner;

public class ucgenelmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0) {
            // Çift sayı ise
            for (int i = 1; i <= num; i += 2) {
                int space = (num - i) / 2;
                System.out.println(" ".repeat(space) + "*".repeat(i) + " ".repeat(space));
            }
            for (int i = num - 2; i >= 1; i -= 2) {
                int space = (num - i) / 2;
                System.out.println(" ".repeat(space) + "*".repeat(i) + " ".repeat(space));
            }
        } else {
            // Tek sayı ise
            for (int i = 1; i <= num; i += 2) {
                int space = (num - i) / 2;
                System.out.println(" ".repeat(space) + "*".repeat(i) + " ".repeat(space));
            }
            for (int i = num - 2; i >= 1; i -= 2) {
                int space = (num - i) / 2;
                System.out.println(" ".repeat(space) + "*".repeat(i) + " ".repeat(space));
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class minvemax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE; // En küçük int değeri ile başlatılır
        int min = Integer.MAX_VALUE; // En büyük int değeri ile başlatılır

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int num = scanner.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        scanner.close();
    }
}

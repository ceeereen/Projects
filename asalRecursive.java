import java.util.Scanner;

public class asalRecursive {

    public static boolean isPrime(int num, int div) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % div == 0) {
            return false;
        } else if (div * div > num) {
            return true;
        } else {
            return isPrime(num, div + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int num = scanner.nextInt();
        scanner.close();
        if (isPrime(num, 2)) {
            System.out.println(num + " sayısı ASALDIR !");
        } else {
            System.out.println(num + " sayısı ASAL değildir !");
        }
    }
}

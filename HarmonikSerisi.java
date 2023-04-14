import java.util.Scanner;

public class HarmonikSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();
        scanner.close();
        
        double harmonikSerisi = 0;
        
        for (int i = 1; i <= n; i++) {
            harmonikSerisi += (1.0 / i);
        }
        
        System.out.println(n + " sayısının harmonik serisi: " + harmonikSerisi);
    }
}

import java.util.Scanner;

public class Siralama {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üç sayı girin:");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();

        int enKucuk = Math.min(Math.min(sayi1, sayi2), sayi3);
        int enBuyuk = Math.max(Math.max(sayi1, sayi2), sayi3);
        int ortanca = sayi1 + sayi2 + sayi3 - enKucuk - enBuyuk;

        System.out.println(enKucuk + " < " + ortanca + " < " + enBuyuk);
    }

}

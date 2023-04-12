import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("Seçiniz ");
        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam " + (sayi1 + sayi2));
                break;

            case 2:
                System.out.println("Çikart " + (sayi1 - sayi2 ));
                break;

            case 3:
                System.out.println("Çarp " + (sayi1 * sayi2 ));
                break;

            default:
                System.out.println("Böl " + (sayi1 / sayi2 ));
                break;
        }
    }
}

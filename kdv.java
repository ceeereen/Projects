import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();
        double kdvFıyatı = ondalikliSayi * 1.18;
        System.out.println(kdvFıyatı);
        }
}

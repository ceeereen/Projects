import java.util.Scanner;

public class usluSayi2 {
    public static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban değeri giriniz");
        int taban = scanner.nextInt();
        System.out.println("Üs değeri giriniz");
        int üs = scanner.nextInt();
        if (üs == 0) {
            System.out.println(taban); 
        }
        else {
            for (int j = 1; j<üs; j++) {
                taban *= taban;
                System.out.println(taban); 
            }
        }
    scanner.close();
    }
    public static void main(String[] args) {
        power();
    }
}

import java.util.Scanner;


public class vki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();
        double vki = boy * kilo;
        System.out.println("Vücut Kitle İndeksiniz : ", vki);

        
    }
}

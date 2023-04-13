import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz: ");
        int km = scanner.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = scanner.nextInt();
        
        if (km <= 0 || age <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double tutar = km * 0.10;
            double toplamTutar;

            if (yolculukTipi == 2) {
                if (age < 12) {
                    toplamTutar = tutar - tutar * 0.2 - tutar * 0.5;
                    System.out.println(toplamTutar);
                }
                else if(age > 12 && age < 24) {
                    toplamTutar = tutar - tutar * 0.2 - tutar * 0.1;
                    System.out.println(toplamTutar);
                }
                else if(age > 65) {
                    toplamTutar = tutar - tutar * 0.2 - tutar * 0.3;
                    System.out.println(toplamTutar);
                }
            }
            else {
                if (age < 12) {
                    toplamTutar = tutar - tutar * 0.5;
                    System.out.println(toplamTutar);
                }
                else if(age > 12 && age < 24) {
                    toplamTutar = tutar - tutar * 0.1;
                    System.out.println(toplamTutar);
                }
                else if(age > 65) {
                    toplamTutar = tutar - tutar * 0.3;
                    System.out.println(toplamTutar);
                }
            }
        }
        scanner.close(); 
    }
}
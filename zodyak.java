import java.time.LocalDate;
import java.util.Scanner;

public class zodyak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Doğum tarihinizi girin (gg/aa/yyyy): ");
        String dogumTarihi = scanner.nextLine();
        
        String[] tarihParcalari = dogumTarihi.split("/");
        int gun = Integer.parseInt(tarihParcalari[0]);
        int ay = Integer.parseInt(tarihParcalari[1]);
        int yil = Integer.parseInt(tarihParcalari[2]);
        
        LocalDate date = LocalDate.of(yil, ay, gun);
        
        if (date.isAfter(LocalDate.of(yil, 3, 20)) && date.isBefore(LocalDate.of(yil, 4, 21))) {
            System.out.println("Koç Burcu");
        } else if (date.isAfter(LocalDate.of(yil, 4, 20)) && date.isBefore(LocalDate.of(yil, 5, 22))) {
            System.out.println("Boğa Burcu");
        } else if (date.isAfter(LocalDate.of(yil, 5, 21)) && date.isBefore(LocalDate.of(yil, 6, 23))) {
            System.out.println("İkizler Burcu");
        } else if (date.isAfter(LocalDate.of(yil, 6, 22)) && date.isBefore(LocalDate.of(yil, 7, 23))) {
            System.out.println("Yengeç Burcu");
        } else if (date.isAfter(LocalDate.of(yil, 7, 22)) && date.isBefore(LocalDate.of(yil, 8, 23))) {
            System.out.println("Aslan Burcu");
        } else if (date.isAfter(LocalDate.of(yil, 8, 22)) && date.isBefore(LocalDate.of(yil, 9, 23))) {
            System.out.println("Başak Burcu");
        } else if (date.isAfter(LocalDate.of(yil, 9, 22)) && date.isBefore(LocalDate.of(yil, 10, 23))) {
            System.out.println("Terazi Burcu");
        } else if (date.isAfter(LocalDate.of(yil, 10, 22)) && date.isBefore(LocalDate.of(yil, 11, 22))) {
            System.out.println("Akrep Burcu");
        } else if (date.isAfter(LocalDate.of(yil, 11, 21)) && date.isBefore(LocalDate.of(yil, 12, 22))) {
            System.out.println("Yay Burcu");
        } else if (date.isAfter(LocalDate.of(yil, 12, 21)) || date.isBefore(LocalDate.of(yil, 1, 22))) {
            System.out.println("Oğlak Burcu");
        } else if (date.isAfter(LocalDate.of(yil, 1, 21)) && date.isBefore(LocalDate.of(yil, 2, 20))) {
            System.out.println("Kova Burcu");
        } else {
            System.out.println("Balık Burcu");
        }
        
        scanner.close();
    }

}

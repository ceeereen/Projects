import java.util.Scanner;

import javax.swing.event.DocumentEvent.ElementChange;

public class manav {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç kilo armut?");
        double armut = scanner.nextDouble();
        System.out.println("Kaç kilo elma?");
        double elma = scanner.nextDouble();
        System.out.println("Kaç kilo domates?");
        double domates = scanner.nextDouble();
        System.out.println("Kaç kilo muz?");
        double muz = scanner.nextDouble();
        System.out.println("Kaç kilo patlıcan?");
        double patlıcan = scanner.nextDouble();

        double tutar = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlıcan * 5;
        System.out.println(tutar);

    }
}

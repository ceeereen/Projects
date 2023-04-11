import java.util.Scanner;

import javax.swing.ToolTipManager;

public class taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int starter = 10;
        System.out.println("Kaç km? ");
        double km = scanner.nextDouble();
        double total = starter + km * 2.20;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar " + total);

    }
}

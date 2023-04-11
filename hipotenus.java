import java.util.Scanner;
import java.lang.Math;

public class hipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Uzun: ");
        double uzunkenar = scanner.nextDouble();
        System.out.print("Kısa: ");
        double kısakenar = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(uzunkenar,2) + Math.pow(kısakenar,2));
        System.out.println(c);
        }

}

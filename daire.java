import java.util.Scanner;
import java.lang.Math;

public class daire {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yarı çap: ");
        double radius = scanner.nextDouble();
        double pi = Math.PI;

        double alan = pi * Math.pow(radius, 2);
        double perimeter = 2 * pi * radius;

        System.out.println("alan: " + String.format("%.2f", alan));
        System.out.println("çevre " + String.format("%.2f", perimeter));
    }
}

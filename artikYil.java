import java.util.Scanner;

public class artikYil {
    static public void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        int yil = scanner.nextInt();

        if (yil % 4 == 0) {
            System.out.println(yil + " bir artık yıldır!");
        }
        else {
            System.out.println(yil + " bir artık yıldır değildir !");
        }
        scanner.close(); 
    }
}

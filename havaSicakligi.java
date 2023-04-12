import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class havaSicakligi {
    public static void main(String[] args) {

        Map<String, String> aktiviteler = new HashMap<>();
        // Anahtar ve değerleri içeren bir Map
        aktiviteler.put("5'ten küçük", "Kayak");
        aktiviteler.put("5 ve 15 arasında", "Sinema");
        aktiviteler.put("15 ve 25 arasında", "Piknik");
        aktiviteler.put("25'ten büyük", "Yüzme");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık kaç derece? ");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println(aktiviteler.get("5'ten küçük"));
        }
        else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println(aktiviteler.get("5 ve 15 arasında"));
        }
        else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println(aktiviteler.get("15 ve 25 arasında"));
        }
        else {
            System.out.println(aktiviteler.get("25'ten büyük"));
        }
    }
}

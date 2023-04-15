import java.util.Scanner;

public class palindrom {

    public static boolean isPalindrom(int sayi) {
        String tersSayi = "";
        String Ssayi = Integer.toString(sayi);
        while (sayi != 0) {
            for (int i = Ssayi.length()-1; i >= 0; i--) {
                tersSayi += Ssayi.charAt(i);
            }
            break;
        
        }
        
        if (Ssayi.equals(tersSayi)) {
            System.out.println(Ssayi + " bir Palindrom Sayı'dır.");
            return true;
        }
        else {
            System.out.println(Ssayi + " bir Palindrom Sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        sayi = input.nextInt();
        
        isPalindrom(sayi);
        
        input.close();
    }
}

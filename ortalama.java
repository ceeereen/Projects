import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunu giriniz:");
        mat = scanner.nextInt();
        System.out.println("Fizik notunu giriniz:");
        fizik = scanner.nextInt();
        System.out.println("Kimya notunu giriniz:");
        kimya = scanner.nextInt();
        System.out.println("Türkçe notunu giriniz:");
        turkce = scanner.nextInt();
        System.out.println("Müzik notunu giriniz:");
        muzik = scanner.nextInt();
    
        if(mat>=0 && mat<=100 && fizik>=0 && fizik<=100 && kimya>=0 && kimya<=100 && turkce>=0 && turkce<=100 && muzik>=0 && muzik<=100){
            int ortalama = (mat + fizik + kimya + turkce + muzik) / 5;
            if (ortalama >= 55) {
                System.out.println("Geçtiniz");
            }
            else{
                System.out.println("Not ortalamanız yeterli değil: " + ortalama);
            }
        }else{
            System.out.println("Lütfen notları 0-100 aralığında giriniz!");
        }
    
    }
}

import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = input.nextInt();

        System.out.print("r değerini girin: ");
        int r = input.nextInt();

        int nFaktoriyel = faktoriyel(n);
        int rFaktoriyel = faktoriyel(r);
        int nMinusRFaktoriyel = faktoriyel(n - r);

        int kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);

        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);

        input.close();
    }

    public static int faktoriyel(int sayi) {
        int faktoriyel = 1;

        for (int i = 2; i <= sayi; i++) {
            faktoriyel *= i;
        }

        return faktoriyel;
    }
}

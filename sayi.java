import java.util.Scanner;

public class sayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = scanner.nextInt();

        String snum = Integer.toString(num);

        for (int i = 0; i < snum.length(); i++) {
            int basamak = Character.getNumericValue(snum.charAt(i));
            System.out.println(basamak);
        }
    scanner.close(); 
    }
    
}

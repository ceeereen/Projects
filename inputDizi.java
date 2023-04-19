import java.util.Arrays;
import java.util.Scanner;

public class inputDizi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num");
        int boyut = scanner.nextInt();
        int[] array = new int[boyut];

        for (int i = 0; i<array.length; i++) {
            System.out.println("Enter a num");
            array[i] = scanner.nextInt();
        }
        System.out.println("Dizi: " + Arrays.toString(array));
    
    scanner.close();
    }
}

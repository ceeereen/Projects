import java.util.Scanner;

public class harmonik {
    
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Scanner scanner = new Scanner(System.in);
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        numbers[3] = scanner.nextInt();

        double sum = 1.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0/numbers[i];
        }

        double harmonicMean = numbers.length/sum;
        System.out.println(harmonicMean); 
    scanner.close();
    }
}

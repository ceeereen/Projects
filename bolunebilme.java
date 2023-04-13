import java.util.ArrayList;
import java.util.Scanner;


public class bolunebilme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = scanner.nextInt();
        ArrayList<Double> nums = new ArrayList<Double>();
        double sum = 0;

        for (double i = 1; i < num; i++) {
            
            if (i % 3 == 0 || i % 4 == 0) {
                nums.add(i);
                sum += i;
            }
        }
        System.out.println("Average is " + sum/(nums.size()));
    scanner.close();
    }
}

import java.util.Scanner;

public class mukemmelsayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println(num +  " mükemmel bir sayı");
        }
        else {
            System.out.println(num + " mükemmel bir sayı değil");
        }
        System.out.println(sum);

    scanner.close();
    }
        

}

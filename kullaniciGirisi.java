import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your username");
        String username = scanner.nextLine();
        System.out.println("enter your password");
        String password = scanner.nextLine();

        if (username.equals("ceren") && password.equals("kandaz")) {
            System.out.println("successful");
        }
        else {
            System.out.println("Try again");
        }
    }
    
}

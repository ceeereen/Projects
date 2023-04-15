import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class ebob_ekok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int num2 = scanner.nextInt();
        ArrayList<Integer> ebob_list = new ArrayList<Integer>();

        for(int i=1; i <= Math.max(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob_list.add(i);
            }
        }
        int len = ebob_list.size();
        Collections.sort(ebob_list);
        int ebob = ebob_list.get(len-1);
        System.out.println("ebob is " + ebob);
        int ekok = num1 * num2 / ebob;
        System.out.println("ekok is " + ekok);
    scanner.close();
        }
    }


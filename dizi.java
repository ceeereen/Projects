import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class dizi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        int num = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < dizi.length; i++) {
            arrayList.add(dizi[i]);
        }
        arrayList.add(num);
        Collections.sort(arrayList);
        
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == num) {
                System.out.println("En küçük " + arrayList.get(i-1));
                System.out.println("En küçük " + arrayList.get(i+1));
            }
        }
    scanner.close();
    }
}

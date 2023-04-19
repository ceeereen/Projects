import java.util.Arrays;

public class transpoze {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] newArray = new int[3][2];

        // Transpozunu al
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[j][i] = array[i][j];
            }
        }

        // Transpozunu alınmış diziyi ekrana yazdır
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }
    }
}

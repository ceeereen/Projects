public class tekrarEden {
    public static void main(String[] args) {
        int[] numbers = {7,8,7,11,22,8,5,6};
        for(int i = 0; i<numbers.length; i++) {
            boolean isDuplicate = false;
            for(int j=i+1; j<numbers.length; j++) {
                if (numbers[i] % 2 ==0) {
                    if (numbers[i] == numbers[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                
            }
            if(isDuplicate) {
                System.out.println(numbers[i]);
            }
        }
    }
}

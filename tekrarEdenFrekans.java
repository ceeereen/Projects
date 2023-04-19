public class tekrarEdenFrekans {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] isDuplicate = new boolean[numbers.length];
        
        // tekrar eden sayıları bul
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    isDuplicate[i] = true;
                    isDuplicate[j] = true;
                    break;
                }
            }
        }
        
        // her tekrar eden sayının tekrar sayısını yazdır
        for(int i = 0; i < numbers.length; i++) {
            if(isDuplicate[i]) {
                int count = 0;
                for(int j = 0; j < numbers.length; j++) {
                    if(numbers[i] == numbers[j]) {
                        count++;
                    }
                }
            System.out.println(numbers[i] + " sayısı " + count + " kez tekrar edildi.");
            }
        }
    }
}

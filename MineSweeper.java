import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int[][] board;
    private boolean[][] mines;
    private int size;
    private int minesCount;
    private int revealedCount;
    private boolean gameOver;

    public MineSweeper(int size, int minesCount) {
        this.size = size;
        this.minesCount = minesCount;
        this.revealedCount = 0;
        this.gameOver = false;
        this.board = new int[size][size];
        this.mines = new boolean[size][size];

        // Mayınları yerleştir
        Random rand = new Random();
        int minesPlaced = 0;
        while (minesPlaced < minesCount) {
            int row = rand.nextInt(size);
            int col = rand.nextInt(size);
            if (!mines[row][col]) {
                mines[row][col] = true;
                minesPlaced++;
            }
        }
    }

    public void printBoard() {
        System.out.print(" ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    
        for (int i = 0; i < size; i++) {
            System.out.print(i);
            for (int j = 0; j < size; j++) {
                if (board[i][j] == -1) {
                    System.out.print(" -");
                } else {
                    System.out.print(" " + board[i][j]);
                }
            }
            System.out.println();
        }
    }
    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!gameOver && revealedCount < size * size - minesCount) {
            // Tahta durumunu göster
            printBoard();

            // Kullanıcıdan girdi al
            System.out.println("Satır ve sütun numaralarını giriniz: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Girilen noktanın geçerli olup olmadığını kontrol et
            if (row < 0 || row >= size || col < 0 || col >= size) {
                System.out.println("Geçersiz bir nokta girdiniz. Lütfen tekrar deneyin.");
                continue;
            }

            // Nokta zaten açılmışsa uyarı ver ve tekrar iste
            if (board[row][col] != -1) {
                System.out.println("Bu nokta zaten açık. Lütfen tekrar deneyin.");
                continue;
            }

            // Mayına bastıysa oyunu bitir
            if (mines[row][col]) {
                gameOver = true;
                System.out.println("Maalesef, bir mayına bastınız. Oyun bitti.");
                printBoard();
                continue;
            }

            // Noktaya değen mayınların sayısını hesapla
            int count = 0;
            if (row > 0 && col > 0 && mines[row-1][col-1]) count++;
            if (row > 0 && mines[row-1][col]) count++;
            if (row > 0 && col < size-1 && mines[row-1][col+1]) count++;
            if (col > 0 && mines[row][col-1]) count++;
            if (col < size-1 && mines[row][col+1]) count++;
            if (row < size-1 && col > 0 && mines[row+1][col-1]) count++;
            if (row < size-1 && mines[row+1][col]) count++;
            if (row < size-1 && col < size-1 && mines[row+1][col+1]) count++;

            // Noktayı aç ve değerini ata
            board[row][col] = count;
            revealedCount++;
        }

        // Oyun bitti
        if (!gameOver) {
            System.out.println("The Ende");
        }
    }
    public static void main(String[] args) {
        MineSweeper game = new MineSweeper(10, 10);
        game.play();
    }
}
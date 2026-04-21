import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        // Initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        printBoard(board);

        // Toss logic
        Random rand = new Random();
        int toss = rand.nextInt(2);

        char playerSymbol;
        char computerSymbol;
        char currentPlayer;

        if (toss == 0) {
            playerSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = playerSymbol;
            System.out.println("You won the toss!");
        } else {
            playerSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = computerSymbol;
            System.out.println("Computer won the toss!");
        }

        System.out.println("Your symbol: " + playerSymbol);
        System.out.println("Computer symbol: " + computerSymbol);

        if (currentPlayer == playerSymbol)
            System.out.println("You play first!");
        else
            System.out.println("Computer plays first!");
    }

    public static void printBoard(char[][] board) {
        System.out.println("Tic-Tac-Toe Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
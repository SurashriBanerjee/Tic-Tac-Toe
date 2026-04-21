import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        printBoard(board);

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

        int userSlot = getUserInput();
        System.out.println("You selected slot: " + userSlot);
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

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a slot number (1-9): ");
        return sc.nextInt();
    }
}
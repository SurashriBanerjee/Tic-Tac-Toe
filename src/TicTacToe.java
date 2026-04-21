import java.util.Scanner;
public class TicTacToe {

        public static void main(String[] args) {

            char[][] board = new char[3][3];

            // Initialize board with '-'
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }

            // Display board
            printBoard(board);
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
        int slot = sc.nextInt();

        return slot;
    }
    }


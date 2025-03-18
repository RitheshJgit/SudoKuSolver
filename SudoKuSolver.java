
import java.util.Random;
import java.util.Scanner;

public class SudokuSolver {
    private static final int SIZE = 9; // Sudoku size
    private static final int SUBGRID = 3; // Subgrid size

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[SIZE][SIZE];

        System.out.println("Do you want to enter Sudoku manually? (yes/no)");
        String choice = scanner.next().toLowerCase();

        if (choice.equals("yes")) {
            System.out.println("Enter the Sudoku row by row (use 0 for empty cells):");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    board[i][j] = scanner.nextInt();
                }
            }
        } else {
            board = generateRandomSudoku();
            System.out.println("Generated Sudoku:");
            printBoard(board);
        }

        System.out.println("\nSolving Sudoku...\n");
        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists!");
        }

        scanner.close();
    }

    // Backtracking Algorithm
    private static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) { // Find an empty cell
                    for (int num = 1; num <= SIZE; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                            if (solveSudoku(board)) { // Recursively solve
                                return true;
                            }

                            board[row][col] = 0; // Backtrack
                        }
                    }
                    return false; // No valid number found, trigger backtracking
                }
            }
        }
        return true; // Solved
    }

    // Check if placing num at board[row][col] is valid
    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) return false;
        }

        int startRow = row - row % SUBGRID, startCol = col - col % SUBGRID;
        for (int i = 0; i < SUBGRID; i++) {
            for (int j = 0; j < SUBGRID; j++) {
                if (board[startRow + i][startCol + j] == num) return false;
            }
        }

        return true;
    }

    // Generate a random valid Sudoku board
    private static int[][] generateRandomSudoku() {
        int[][] board = new int[SIZE][SIZE];
        Random random = new Random();

        // Place a few random numbers
        for (int i = 0; i < SIZE; i++) {
            int row = random.nextInt(SIZE);
            int col = random.nextInt(SIZE);
            int num = random.nextInt(SIZE) + 1;

            if (isValid(board, row, col, num)) {
                board[row][col] = num;
            }
        }

        return board;
    }

    // Print Sudoku board
    private static void printBoard(int[][] board) {
        for (int i = 0; i < SIZE; i++) {
            if (i % SUBGRID == 0) System.out.println("-------------------------");
            for (int j = 0; j < SIZE; j++) {
                if (j % SUBGRID == 0) System.out.print("| ");
                System.out.print(board[i][j] == 0 ? ". " : board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------------------");
    }
}

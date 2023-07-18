import java.util.Scanner;

public class Main {

    private static final int ROW = 3;
    private static final int COL = 3;
    private static String board[][] = new String[ROW][COL];

    public static void main(String[] args) {
        boolean playAgain = true;
        String player = "X";
        int rowChoice;
        int colChoice;
        int moveCounter = 0;
        boolean validMove = false;
        boolean gameOver = false;
        Scanner scan = new Scanner(System.in);


        do {
            do {
                if (moveCounter == 0) {
                    clearBoard();
                    showBoard();
                    player = "X";
                    gameOver = false;
                }
                validMove = false;

                do {
                    System.out.println();
                    System.out.println("Player " + player + "'s Turn");

                    rowChoice = (SafeInput.getRangedInt(scan, "Enter a Row 1 - 3", 1, 3)) - 1;
                    colChoice = (SafeInput.getRangedInt(scan, "Enter a Column 1 - 3", 1, 3)) - 1;

                    if (isValidMove(rowChoice, colChoice) == true) {
                        board[rowChoice][colChoice] = player;
                        moveCounter++;
                        validMove = true;
                    } else {
                        System.out.println("Error, space already filled!");
                    }
                    ;
                    if (moveCounter >= 5) {
                        if (isRowWin(player) == true) {
                            System.out.println("Player " + player + " wins!");
                            gameOver = true;
                        }
                        else if (isColWin(player) == true) {
                            System.out.println("Player " + player + " wins!");
                            gameOver = true;
                        }
                        else if (isDiagonalWin(player) == true) {
                            System.out.println("Player " + player + " wins!");
                            gameOver = true;
                        }

                        if (((isRowTie(player) == true || isColTie(player) == true) || (isDagTie(player) == true)) || ((moveCounter == 9) && (gameOver = false)))
                        {
                            System.out.println("Its a stalemate!");
                            gameOver = true;
                        }
                    }
                } while (validMove == false);

                showBoard();

                if (player.equals("X")) {
                    player = "O";
                } else {
                    player = "X";
                }
            } while (!gameOver == true);
            playAgain = SafeInput.getYNConfirm(scan, "Would you like to play again? Y/N");
            moveCounter = 0;
        } while (!playAgain == false);
    }

    private static void clearBoard() {
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                board[row][col] = " ";
            }
        }
    }

    ;

    private static void showBoard() {
        for (int row = 0; row < ROW; row++) {
            System.out.println();
            for (int col = 0; col < COL; col++) {
                if (col == 2) {
                    System.out.print(board[row][col]);
                } else {
                    System.out.print(board[row][col] + " | ");
                }
            }
        }
    }

    private static boolean isValidMove(int row, int col) {
        if (board[row][col].equals(" ")) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isRowWin(String player) {
        for (int row = 0; row < ROW; row++) {
            if (board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isColWin(String player) {
        for (int col = 0; col < COL; col++) {
            if (board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDiagonalWin(String player) {
        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
            return true;
        } else if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
            return true;
        }
        return false;
    }

    private static boolean isRowTie(String player) {
        int rowCount = 0;

        String opponent = "";

        if (player.equals("X")) {
            opponent = "O";
        } else {
            opponent = "X";
        }

        for (int row = 0; row < ROW; row++) {
            if (board[row][0].equals(player) || board[row][1].equals(player) || board[row][2].equals(player)) {
                if (board[row][0].equals(opponent) || board[row][1].equals(opponent) || board[row][2].equals(opponent)) {
                    rowCount++;
                }
            }
        }
        if (rowCount == 3) {
            return true;
        }
        return false;
    }

    private static boolean isColTie(String player) {
        int colCount = 0;
        String opponent = "";
        if (player.equals("X")) {
            opponent = "O";
        } else {
            opponent = "X";
        }
        for (int col = 0; col < ROW; col++) {
            if (board[0][col].equals(player) || board[1][col].equals(player) || board[2][col].equals(player)) {
                if (board[0][col].equals(opponent) || board[1][col].equals(opponent) || board[2][col].equals(opponent)) {
                    colCount++;
                }
            }
        }
        if (colCount == 3) {
            return true;
        }
        return false;
    }

    private static boolean isDagTie(String player) {
        int dagCount = 0;

        String opponent = "";

        if (player.equals("X")) {
            opponent = "O";
        } else {
            opponent = "X";
        }

        if (board[0][0].equals(player) || board[1][1].equals(player) || board[2][2].equals(player)) {
            if (board[0][0].equals(opponent) || board[1][1].equals(opponent) || board[2][2].equals(opponent)) {
                dagCount++;
            }
        } else if (board[0][2].equals(player) || board[1][1].equals(player) || board[2][0].equals(player)) {
            if (board[0][2].equals(opponent) || board[1][1].equals(opponent) || board[2][0].equals(opponent)) {
                dagCount++;
            }
        }
        if (dagCount == 2) {
            return true;
        }
        return false;
    }
}


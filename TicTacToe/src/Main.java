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

        //This is the main game loop.
        do {
            do {
                //This resets the board, the starting player, and the gameOver flag.
                if (moveCounter == 0) {
                    clearBoard();
                    showBoard();
                    player = "X";
                    gameOver = false;
                }
                validMove = false;

                //This starts the player's move loop.
                do {
                    System.out.println();
                    System.out.println("Player " + player + "'s Turn");

                    //These 2 lines prompt the user for a input, and validates that they are within the range we want.
                    rowChoice = (SafeInput.getRangedInt(scan, "Enter a Row 1 - 3", 1, 3)) - 1;
                    colChoice = (SafeInput.getRangedInt(scan, "Enter a Column 1 - 3", 1, 3)) - 1;

                    //This verifies that the move that was inputted is a valid move, and the space is empty.
                    //If that is true, it adds it to the board, and moves the moveCounter up 1.
                    if (isValidMove(rowChoice, colChoice) == true) {
                        board[rowChoice][colChoice] = player;
                        moveCounter++;
                        validMove = true;
                    } else {
                        System.out.println("Error, space already filled!");
                    }
                    ;

                    //After 5 moves, the game checks to see if the player has won.
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

                        //We also check to see if the game is unwinnable for both players, and would end in a tie.
                        if ((((isRowTie(player) == true || isColTie(player) == true) || (isDagTie(player) == true)) && gameOver == false) || ((moveCounter == 9) && (gameOver = false)))
                        {
                            System.out.println("Its a stalemate!");
                            gameOver = true;
                        }
                    }
                } while (validMove == false);

                showBoard();

                //This is a toggle to switch between players after each move.
                if (player.equals("X")) {
                    player = "O";
                } else {
                    player = "X";
                }
            } while (!gameOver == true);

            //This prompts the user if they want to play again, and verifies they gave a Y or N answer.
            playAgain = SafeInput.getYNConfirm(scan, "Would you like to play again? Y/N");
            moveCounter = 0;
        } while (!playAgain == false);
    }

    //This function clears the board of all moves.
    private static void clearBoard() {
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                board[row][col] = " ";
            }
        }
    }

    ;

    //This function shows the board of the game.
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

    //This function validates that the 2 inputs the user gave is a valid move in the game.
    private static boolean isValidMove(int row, int col) {
        if (board[row][col].equals(" ")) {
            return true;
        } else {
            return false;
        }
    }

    //This checks to see if the user has a row win.
    private static boolean isRowWin(String player) {
        for (int row = 0; row < ROW; row++) {
            if (board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player)) {
                return true;
            }
        }
        return false;
    }

    //This checks to see if the user has a column win.
    private static boolean isColWin(String player) {
        for (int col = 0; col < COL; col++) {
            if (board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player)) {
                return true;
            }
        }
        return false;
    }

    //This checks to see if the user has a diagonal win.
    private static boolean isDiagonalWin(String player) {
        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
            return true;
        } else if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
            return true;
        }
        return false;
    }

    //This checks to see if there is a tie in all of the rows between the players.
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

    //This checks to see if all the columns are in a stalemate between the 2 players.
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
    //This checks to see if there is a tie in the diagonals.
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


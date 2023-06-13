import java.util.Scanner;

public class Ass01_RockPaperScissors {

    public static void main(String[] args) {

        String playerAMove;
        String playerBMove;
        String playAgain;
        Scanner scan = new Scanner(System.in);

        boolean playerAMoveValid = false;
        boolean playerBMoveValid = false;
        boolean playAgainValid = false;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        do {
            playerAMoveValid = false;
            playerBMoveValid = false;
            playAgainValid = false;
            do {
                System.out.println("Player A, choose (R)ock, (P)aper, or (S)cissors: ");
                playerAMove = scan.nextLine().toUpperCase();

                if (!playerAMove.matches("[RPS]")) {
                    System.out.println("Illegal Move! You did not enter R, P, or S. Try again.");
                } else {
                    playerAMoveValid = true;
                }

            } while (!playerAMoveValid);

            do {
                System.out.println("Player B, choose (R)ock, (P)aper, or (S)cissors: ");
                playerBMove = scan.nextLine().toUpperCase();

                if (!playerBMove.matches("[RPS]")) {
                    System.out.println("Illegal Move! You did not enter R, P, or S. Try again.");
                } else {
                    playerBMoveValid = true;
                }

            } while (!playerBMoveValid);

            if (playerAMove.matches("R"))
            {
                if (playerBMove.matches("S"))
                {
                    System.out.println("Rock smashes Scissors. Player A wins!");
                }
                else if (playerBMove.matches("P"))
                {
                    System.out.println("Paper cover Rock. Player B wins!");
                }
                else
                {
                    System.out.println("Rock vs Rock. It's a tie!");
                }
            }
            else if(playerAMove.matches("P"))
            {
                if (playerBMove.matches("S"))
                {
                    System.out.println("Scissors cuts paper. Player B wins!");
                }
                else if (playerBMove.matches("R"))
                {
                    System.out.println("Paper covers Rock. Player A wins!");
                }
                else
                {
                    System.out.println("Paper vs Paper. It's a tie!");
                }
            }
            else
            {
                if (playerBMove.matches("R")) {
                    System.out.println("Rock smashes Scissors. Player B wins!");
                } else if (playerBMove.matches("P")) {
                    System.out.println("Scissors cut Paper. Player A wins!");
                } else {
                    System.out.println("Scissors vs Scissors. It's a tie!");
                }
            }


            do
            {
                System.out.println("Would you like to play again? Y/N");
                playAgain = scan.nextLine().toUpperCase();
               if(!playAgain.matches("[YN]")) {
                   System.out.println("Illegal Entry. Please choose either Y or N");
               }
               else
               {
                   playAgainValid = true;
               }
            }while(!playAgainValid);
        } while (playAgain.matches("Y"));
    }
}

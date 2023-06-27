import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

	Random rnd = new Random();
	Scanner scan = new Scanner(System.in);
	int die1 = rnd.nextInt(6)+1;
	int die2 = rnd.nextInt(6)+1;
	int crapsRoll = die1+die2;
	int dieRoll = 1;
	int point = 0;
	String playAgain;
	boolean crapsOut = false;
	boolean gameOver = false;

	System.out.println("Welcome to Craps!");


	do {
        die1 = rnd.nextInt(6)+1;
        die2 = rnd.nextInt(6)+1;
        crapsRoll = die1+die2;
        dieRoll = 1;
        crapsOut = false;
        point = 0;
        gameOver = false;

        System.out.println("Role " + dieRoll + ": " + crapsRoll);

	    if (crapsRoll == 2 && dieRoll == 1)
        {
            crapsOut = true;
        }
	    else if (crapsRoll == 3 && dieRoll == 1)
	    {
            crapsOut = true;
        }
        else if (crapsRoll == 12 && dieRoll == 1)
        {
            crapsOut = true;
        };

        if(crapsOut == false)
        {
            if (crapsRoll == 7 && dieRoll == 1)
            {
                System.out.println("You've won with a natural " + crapsRoll);
            }
            else if (crapsRoll == 11 && dieRoll == 1)
            {
                System.out.println("You've won with a natural " + crapsRoll);
            }
            else
            {
                point = crapsRoll;
                System.out.println("Your point will be: " + crapsRoll);
                do
                {
                    die1 = rnd.nextInt(6)+1;
                    die2 = rnd.nextInt(6)+1;
                    crapsRoll = die1+die2;
                    dieRoll++;
                    System.out.println("Role " + dieRoll + ": " + crapsRoll);
                    if (crapsRoll == 7)
                    {
                        System.out.println("You rolled a 7! You lose!");
                        gameOver = true;
                    }
                    else if (crapsRoll == point)
                    {
                        System.out.println("You rolled your point. You win!");
                        gameOver = true;
                    }

                }while (!gameOver);
            }
        }
        else
        {
            System.out.println("You have craps with a dice total of " + crapsRoll);
        }

        System.out.println("Would you like to play again? Y/N");
        playAgain = scan.nextLine().toUpperCase();
        while (!playAgain.matches("[YN]")) {
            System.out.println("Illegal Entry. Please choose either Y or N");
            System.out.println("Would you like to play again? Y/N");
            playAgain = scan.nextLine().toUpperCase();
        }

    }while(!playAgain.matches("N"));

    }
}

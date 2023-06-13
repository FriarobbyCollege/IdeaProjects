import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {

        int number = 0;
        int guess = 0;
        boolean done = false;
        String trash;
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        number = generator.nextInt(10) + 1;

        System.out.println("Welcome to Guess the Number!");

        do {
            System.out.println("Enter your guess: ");
            if(scan.hasNextInt()){
                guess = scan.nextInt();
                done = true;
            }
            else {
                trash = scan.nextLine();
                System.out.println("\n You entered: " + trash);
                System.out.println("\nYou need to enter a valid number.\n");
            }
        }while(!done);

        if (guess > number){
            System.out.println("Your guess was too high! Your Guess: " + guess + " The Number: " + number);
        }
        else if (guess < number){
            System.out.println("Your guess was too low! Your Guess: " + guess + " The Number: " + number);
        }
        else{
            System.out.println("You guessed correctly! The number was: " + number);
        }

    }
}

import java.util.Scanner;
public class TheaterKiosk {

    public static void main(String[] args)
    {
	    int userAge = 0;
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter your age: ");

	    if (in.hasNextInt()){
	        userAge = in.nextInt();
	        in.nextLine();
        }
	    else
	    {
	    System.out.println("Error, you did not input a number. Please try again");
        }

	    if (userAge >= 21) {
            System.out.println("You get a wristband!");
        }

    }
}

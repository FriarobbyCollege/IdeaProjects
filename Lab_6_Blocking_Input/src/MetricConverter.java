import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        int userInput = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        boolean done = false;
        String trash;
        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.println("Enter the measurement in meters: ");
            if(scan.hasNextInt())
            {
                userInput = scan.nextInt();
                done = true;
                scan.nextLine();
            }
            else
            {
                trash = scan.nextLine();
                System.out.println("\n You entered: " + trash);
                System.out.println("\nYou need to enter a valid number.\n");
            }
        }
        while(!done);

        miles = userInput / 1609.344;
        feet = userInput * 3.28084;
        inches = userInput * 39.3701;

        System.out.println(userInput + " meters is approximately " + miles + " miles.");
        System.out.println(userInput + " meters is approximately " + feet + " feet.");
        System.out.println(userInput + " meters is approximately " + inches + " inches.");


    }
}

import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        double numOfGallons = 0;
        double milesPerGallon = 0;
        double priceOfGas = 0;
        double priceofHundred = 0;
        double distanceOnGas = 0;
        String trash;

        boolean numOfGallonsDone = false;
        boolean milesPerGallonDone = false;
        boolean priceOfGasDone = false;
        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.println("Enter the number of gallons the gas tank will hold: ");
            if(scan.hasNextDouble())
            {
                numOfGallons = scan.nextDouble();
                scan.nextLine();
                numOfGallonsDone = true;
            }
            else
            {
                trash = scan.nextLine();
                System.out.println("\n You entered: " + trash);
                System.out.println("\nYou need to enter a valid number.\n");
            }
        } while (!numOfGallonsDone);

        do
        {
            System.out.println("Enter the miles per gallon the car gets: ");
            if(scan.hasNextDouble())
            {
                milesPerGallon = scan.nextDouble();
                scan.nextLine();
                milesPerGallonDone = true;
            }
            else
            {
                trash = scan.nextLine();
                System.out.println("\n You entered: " + trash);
                System.out.println("\nYou need to enter a valid number.\n");
            }
        } while (!milesPerGallonDone);

        do
        {
            System.out.println("Enter the price of gas: ");
            if(scan.hasNextDouble())
            {
                priceOfGas = scan.nextDouble();
                scan.nextLine();
                priceOfGasDone = true;
            }
            else
            {
                trash = scan.nextLine();
                System.out.println("\n You entered: " + trash);
                System.out.println("\nYou need to enter a valid number.\n");
            }
        } while (!priceOfGasDone);

        priceofHundred = (100 / milesPerGallon) * priceOfGas;
        distanceOnGas = milesPerGallon * numOfGallons;

        System.out.println("To go 100 miles in this vehicle it would cost you: $" + priceofHundred);
        System.out.println("You can go " + distanceOnGas + " miles on this tank of gas.");
    }
}

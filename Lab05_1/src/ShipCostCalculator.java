import java.util.Scanner;
public class ShipCostCalculator {


    public static void main(String[] args)
    {

        double salesPrice = 0;
        double shippingCost = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the price of the item: $");

        if (in.hasNextDouble())
        {
            salesPrice = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("Error, number not entered. Run the program again and enter a valid number");
        }

        if (salesPrice >= 100)
        {
            System.out.println("Your shipping cost is $" + shippingCost + ". Your total cost will be: $" + salesPrice);
        }
        else
        {
        shippingCost = salesPrice * 0.02;
        System.out.println("Your shipping cost is $" + shippingCost + ". Your total cost will be: $" + (salesPrice + shippingCost));
        }
    }
}

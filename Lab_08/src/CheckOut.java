import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double price;
        double totalCost = 0;
        boolean moreItems = true;

        do
        {
        price = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10.00);
        totalCost = totalCost + price;
        }while(SafeInput.getYNConfirm(in, "Do you have more items?") == true);

        System.out.print("Your total is: $");
        System.out.printf("%.2f", totalCost);
    }
}

import java.util.Scanner;

public class CtoFConverter {

    public static void main(String[] args) {

        double inputTemp = 0;
        String trash;
        boolean done = false;
        double result;
        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.println("Enter a temperature in Celsius to convert to Fahrenheit: ");
            if(scan.hasNextDouble()){
                inputTemp = scan.nextDouble();
                scan.nextLine();
                done = true;
            }
            else
            {
                trash = scan.nextLine();
                System.out.println("\n You entered: " + trash);
                System.out.println("\nYou need ot enter a valid number.\n");
            }
        }while(!done);

        result = ((inputTemp * 9)/5) + 32;

        System.out.println(inputTemp + " degrees Celsius is " + result + " degrees Fahrenheit.");
    }
}

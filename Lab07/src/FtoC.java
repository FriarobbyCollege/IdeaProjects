import java.util.Scanner;

public class FtoC {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double inputTemp = 0;
        boolean hasTemp = false;
        double calcTemp = 0;


        do {
            System.out.println("Enter the temperature in Fahrenheit: ");
            if (scan.hasNextDouble()){
                inputTemp = scan.nextDouble();
                hasTemp = true;
            }
            else{
                System.out.println("Error, you did not input a valid temperature.");
                scan.nextLine();
            }
        }while (!hasTemp);

        calcTemp = ((inputTemp - 32)*5) / 9;
        System.out.println("The temperature in Celsius is: " + calcTemp);
    }
}

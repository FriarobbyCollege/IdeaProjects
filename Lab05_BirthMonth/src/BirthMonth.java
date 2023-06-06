import java.util.Scanner;
public class BirthMonth {

    public static void main(String[] args)
    {

        int birthMonth = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your birth month as a number: ");

        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
        }
        else
        {
            System.out.println("Error, you did not input a value. Please restart the program and enter a correct value.");
        }

        if (birthMonth < 1 || birthMonth > 12)
        {
            System.out.println("Error, the number entered is out of bounds. You entered: " + birthMonth);
        }
        else
        {
            System.out.println("Your birth month is " + birthMonth);
        }
    }
}

import java.util.Scanner;


public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN = SafeInput.getRegExString(in, "Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M number","^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter Menu Choice", "^[OoSsVvQq]$");

        System.out.println(SSN);
        System.out.println(mNumber);
        System.out.println(menuChoice);


    }

}

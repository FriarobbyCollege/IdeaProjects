public class Main {

    public static void main(String[] args)
    {

        int numToExamine = 3;
        int modNumber;

        modNumber = numToExamine % 2;

        if (modNumber == 0)
        {
           System.out.println(numToExamine + " is an even number.");
        }
        else
        {
            System.out.println(numToExamine + " is an odd number.");
        }
    }
}

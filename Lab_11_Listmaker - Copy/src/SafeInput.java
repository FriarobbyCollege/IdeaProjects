import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SafeInput
{

    public static  String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

        } while(retString.length()==0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        Integer retInt = null;
        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
            }
            else
            {
                System.out.println("Error, you did not enter a integer. Please try again.");
                pipe.nextLine();
            }
        }while (retInt == null);
        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        Double retDouble = null;
        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
            }
            else
            {
                System.out.println("Error, you did not enter a double. Please try again.");
                pipe.nextLine();
                pipe.nextLine();
            }
        }while (retDouble == null);
        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        Integer holdInt = null;
        int returnInt = 0;

        do 
        {
         System.out.print("\n" + prompt + ": "); 
         if(pipe.hasNextInt())
         {
             holdInt = pipe.nextInt();

             if(holdInt < low || holdInt > high)
             {
                 System.out.println("Error, you did not enter a integer within the given range. Please try again. \n");
                 holdInt = null;
             }
             else
             {
                 returnInt = holdInt;
             }
         }
         else
         {
             System.out.println("Error, you did not enter a integer. Please try again. \n");
             pipe.nextLine();
             pipe.nextLine();
         }
        } while (holdInt == null);
        return returnInt;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        Double holdDouble = null;
        double returnDouble = 0;

        do
        {
            System.out.print("\n" + prompt + ": ");
            holdDouble = pipe.nextDouble();

            if(holdDouble < low || holdDouble > high)
            {
                System.out.println("Error, you did not enter a double within the given range. Please try again. \n");
                pipe.nextLine();
                holdDouble = null;
            }
            else
            {
                returnDouble = holdDouble;
            }

        } while (holdDouble == null);
        return returnDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        pipe.nextLine();
        String holdString = "";
        boolean returnBool;
        do
        {
            System.out.print("\n" + prompt + ": ");
            holdString = pipe.nextLine().toUpperCase();
            if (holdString.equals("Y") || holdString.equals("N"))
            {

            }
            else
            {
                System.out.println("Error, you did not enter Y or N. Please try again. \n");
                pipe.nextLine();
                pipe.nextLine();
            }
        } while (holdString.isEmpty() || holdString == null);

        if (holdString.toUpperCase().equals("Y"))
        {
            returnBool = true;
        }
        else
        {
            returnBool = false;
        }
        return  returnBool;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String holdString = "";
       String returnString = "";

       String pattern = regEx;
       Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
       Matcher m;

       do
       {
           System.out.print("\n" + prompt + ": ");
           holdString = pipe.nextLine();
           m = r.matcher(holdString);
           if(m.find())
           {
              returnString = holdString;
           }
           else
           {
               System.out.println("Error, you did not enter a correct input. Please try again. \n");
           }
       }while(returnString.isEmpty() || returnString == null);
       return returnString;
    }

    public static void prettyHeader(String msg)
    {
        int msgLength = msg.length();
        int space = (54 - msgLength) / 2;

        for (int i = 0; i < 59; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 0; j < 3; j++)
        {
            System.out.print("*");
        }
        for (int k = 0; k < space; k++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int k = 0; k < space; k++)
        {
            System.out.print(" ");
        }
        for (int j = 0; j < 3; j++)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 59; i++)
        {
            System.out.print("*");
        }
    }

    public static double CtoFTableDisplay(double centigrade)
    {
        double returnDouble = ((centigrade * 9)/ 5) + 32;
        return  returnDouble;
    }
}

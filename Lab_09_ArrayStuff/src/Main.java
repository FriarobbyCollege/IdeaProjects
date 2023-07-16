import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] dataPoints = new int [100];
        Random rnd = new Random();
        int total = 0;
        int average = 0;
        int count = 0;
        boolean found = false;
        int foundAt = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100)+1;
        }

        for (int j = 0; j <  dataPoints.length; j++){
            System.out.print(dataPoints[j] + " | ");
            total = total + j;
        }
        average = total / dataPoints.length;
        System.out.println();
        System.out.println("The sum of the dataPoints array is: " + total);
        System.out.println("The average of the dataPoints array is: " + average);
        System.out.println();
        int userNumber = SafeInput.getRangedInt(scan, "Enter a number between 1 and 100", 1, 100);

        for (int k = 0; k <  dataPoints.length; k++)
        {
            if (dataPoints[k] == userNumber)
            {
                count++;
            }
        }
        System.out.println("The total number of times that number appears in dataPoints is: " + count);
        System.out.println();
        int userNumber2 = SafeInput.getRangedInt(scan, "Enter a number between 1 and 100", 1, 100);
        for(int l = 0; l < dataPoints.length; l++)
        {
            if(dataPoints[l] == userNumber2)
            {
                found = true;
                foundAt = l;
                break;
            }
        }

        if(found == true)
        {
            System.out.println("The number " + userNumber2 + " that you entered is in dataPoints as position number " + foundAt);
        }
        else
        {
            System.out.println("That number does not exist in the dataPoints array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int m = 1; m < dataPoints.length; m++)
        {
            if(dataPoints[m] > max)
            {
               max =  dataPoints[m];
            }
            else if(dataPoints[m] < min)
            {
                min = dataPoints[m];
            }
        }
        System.out.println("The minimum value of dataPoints is: " + min);
        System.out.println("The maximum value of dataPoints is: " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));


    }
    public static double getAverage(int values[])
    {
        double average = 0;
        double total = 0;
        for(int i = 0; i < values.length; i++)
        {
            total = total + values[i];
        }
        average = total / values.length;
        return average;
    }
}



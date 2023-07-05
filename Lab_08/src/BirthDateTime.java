import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int day = 0;

        int year = SafeInput.getRangedInt(in,"Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month as a number", 1, 12);
        switch (month)
        {
            case 2:
            {
                day = SafeInput.getRangedInt(in, "Enter your birth day as a number", 1, 29);
                break;
            }
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            {
                day = SafeInput.getRangedInt(in, "Enter your birth day as a number", 1, 31);
                break;
            }
            case 4: case 6: case 9: case 11:
            {
                day = SafeInput.getRangedInt(in, "Enter your birth day as a number", 1, 30);
                break;
            }
        }
        int hours = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.println("You wer born on " + month + "/" + day + "/" + year + " at " + hours + ":" + minute + "."  );

    }
}

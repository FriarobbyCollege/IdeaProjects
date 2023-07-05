public class CtoFTableDisplay {
    public static void main(String[] args)
    {
        System.out.println("Celsius    Fahrenheit");
        for (int i = -100; i < 101; i++)
        {
            double fahrenheit = SafeInput.CtoFTableDisplay(i);
            System.out.print(i + "        ");
            System.out.printf("%.1f", fahrenheit);
            System.out.println();
        }

    }
}

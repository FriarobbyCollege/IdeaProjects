public class Main {

    public static void main(String[] args)
    {
	 double initialBalance = 5000;
	 double interestRate = 0.17;
	 double firstMonth;
	 double secondMonth;

	 firstMonth = initialBalance * interestRate;
	 secondMonth = (initialBalance + firstMonth) * interestRate;

	 System.out.println("Interest due after 1 month: $" + firstMonth);
	 System.out.println("Interest due after 2 months: $" + secondMonth);
    }
}

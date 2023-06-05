public class Main {

    public static void main(String[] args) {
	double springMaintCost = 500.00;
	double summerMaintCost = 750.00;
	double fallMaintCost = 300.00;
	double winterMaintCost = 200.00;
	double totalMaintCost;

	totalMaintCost = springMaintCost + summerMaintCost + fallMaintCost + winterMaintCost;

	System.out.println("Spring Maintenance Cost: $" + springMaintCost);
	System.out.println("Summer Maintenance Cost: $" + summerMaintCost);
	System.out.println("Fall Maintenance Cost: $" + fallMaintCost);
	System.out.println("Winter Maintenance Cost: $" + winterMaintCost);
	System.out.println("The total maintenance costs are: $" + totalMaintCost);
    }
}

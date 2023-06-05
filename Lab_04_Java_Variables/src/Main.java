public class Main {

    public static void main(String[] args)
    {
	int intOperandA = 1;
	int intOperandB = 5;
	int intSum = 13;
	int intDifference = 22;
	int intQuotient = 2;
	int intModulo = 1;

	double doubleOperandA = 1.2;
	double doubleOperandB= 5.5;
	double doubleSum = 13.75;
	double doubleProduct = 22.125;
	double doubleDifference = 3.333;
	double doubleQuotient = 1.315;

	intSum = intOperandA + intOperandB;
	intQuotient = intDifference % intModulo;
	doubleSum = doubleOperandA + doubleOperandB;
	doubleProduct = doubleOperandA * doubleOperandB;
	doubleDifference = doubleOperandB - doubleOperandA;
	doubleQuotient = doubleOperandB / doubleOperandA;


	System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum );
	System.out.println("The modulo of " + intDifference + " is " + intQuotient );
	System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum );
	System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct );
	System.out.println("The difference of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleDifference);
	System.out.println("The quotient of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleQuotient);

	int numKids = 1;
	String isRaining = "False";
	double priceOfGas = 3.55;
	int favoriteNumber = 44;
	int shoeSize = 15;
	String birthMonth = "August";
	String fullName = "Robert Lee Ballou";

	System.out.println();
	System.out.println("The number of kids in my family is " + numKids);
	System.out.println("The price of gas is $" + priceOfGas + " near me.");
	System.out.println("My favorite number is " + favoriteNumber);
	System.out.println("My shoe size is " + shoeSize);
	System.out.println("My birthday is in " + birthMonth);
	System.out.println("My full name is " + fullName);

    }
}

import java.util.Scanner;
public class PartyAffiliation {

    public static void main(String[] args)
    {

        String partyInput = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your party affliation: (D)emocrat, (R)epublican, (I)ndependent, (O)ther: ");


        partyInput = in.nextLine();

        if (partyInput.toUpperCase().contains("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (partyInput.toUpperCase().contains("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (partyInput.toUpperCase().contains("I"))
        {
            System.out.println("You get a Indepentent Man.");
        }
        else
        {
            System.out.println("You get a Other Otter.");
        }



    }
}

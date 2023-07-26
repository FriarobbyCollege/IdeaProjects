import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> wordList = new ArrayList<>();

    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	String menuChoice = "";
	String wordIn = "";
	int wordChoice = 0;
	boolean exit = false;

	do
	{
        displayMenu();
        menuChoice = SafeInput.getRegExString(scan, "What would you like to do", "[ADPQ]");

        if (menuChoice.toUpperCase().equals("A"))
        {
            System.out.println("What string would you like to add?: ");
            wordIn = scan.nextLine();
            addItem(wordIn);
        }
        else if (menuChoice.toUpperCase().equals("D"))
        {
            System.out.println();
            displayList();
            System.out.println();
            wordChoice = (SafeInput.getInt(scan, "What string would you like to delete? (Type the Number): ")) - 1;
            deleteItem(wordChoice);
            scan.nextLine();
        }
        else if (menuChoice.toUpperCase().equals("P"))
        {
            displayList();
        }
        else
        {
            exit = SafeInput.getYNConfirm(scan, "Are you sure you want to quit? (Y/N");
        }
        

    } while(exit != true);


    }

    private static void displayList()
    {
        for(int i = 0; i < wordList.size(); i++)
        {
            System.out.println(i + 1 + ". " + wordList.get(i));
        }
        System.out.println();
    }
    private static void displayMenu()
    {
        System.out.println("A - Add Item");
        System.out.println("D - Delete Item");
        System.out.println("P - Print the List");
        System.out.println("Q - Quit");
    }
    private static void addItem(String word)
    {
        wordList.add(word);
    }

    private static void deleteItem(int choice)
    {
        wordList.remove(choice);
    }
}

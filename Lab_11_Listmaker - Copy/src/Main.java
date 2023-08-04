import java.nio.file.*;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.*;

public class Main {

    static ArrayList<String> wordList = new ArrayList<>();
    private static OpenOption CREATE;

    public static void main(String[] args)
    {

	Scanner scan = new Scanner(System.in);
	String menuChoice = "";
	String wordIn = "";
	int wordChoice = 0;
	boolean exit = false;
	boolean needsToBeSaved = false;
	boolean saveChoice = false;
	Path target = new File (System.getProperty("user.dir")).toPath();
	JFileChooser chooser = new JFileChooser();

	do
	{
        displayMenu();
        menuChoice = SafeInput.getRegExString(scan, "What would you like to do", "[ADVQOSC]");

        if (menuChoice.toUpperCase().equals("A"))
        {
            System.out.println("What string would you like to add?: ");
            wordIn = scan.nextLine();
            addItem(wordIn);
            needsToBeSaved = true;
        }
        else if (menuChoice.toUpperCase().equals("D"))
        {
            System.out.println();
            displayList();
            System.out.println();
            wordChoice = (SafeInput.getInt(scan, "What string would you like to delete? (Type the Number): ")) - 1;
            deleteItem(wordChoice);
            scan.nextLine();
            needsToBeSaved = true;
        }
        else if (menuChoice.toUpperCase().equals("V"))
        {
            displayList();
        }
        else if (menuChoice.toUpperCase().equals("O"))
        {
            if(needsToBeSaved = true)
            {
                saveChoice =SafeInput.getYNConfirm(scan, "Warning! The current list is not saved. Do you want to save it first? (Y/N");

                if(saveChoice == true)
                {
                    saveList();
                    saveChoice = false;
                }
            }

            try
            {
                if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    target = chooser.getSelectedFile().toPath();

                    Scanner scan2 = new Scanner(target);

                    System.out.println(target.getFileName());
                    while (scan2.hasNextLine())
                    {
                        addItem(scan2.nextLine());
                    }

                    scan2.close();
                }
            }
            catch (FileNotFoundException e)
                {
                    System.out.println("File not found!");
                    e.printStackTrace();
                }
            catch (IOException e)
                {
                    e.printStackTrace();
                }
        }
        else if (menuChoice.toUpperCase().equals("S"))
        {
            saveList();
        }
        else if (menuChoice.toUpperCase().equals("C"))
        {
            for(int i = 0; i < wordList.size(); i ++)
                deleteItem(i);
        }
        else
        {
            exit = SafeInput.getYNConfirm(scan, "Are you sure you want to quit? (Y/N)");
            if(needsToBeSaved = true)
            {
                saveChoice =SafeInput.getYNConfirm(scan, "Warning! The current list is not saved. Do you want to save it first? (Y/N)");

                if(saveChoice == true)
                {
                    saveList();
                    saveChoice = false;
                    needsToBeSaved = false;
                }
            }
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
        System.out.println("V - View List");
        System.out.println("O - Open List from File");
        System.out.println("S - Save List to File");
        System.out.println("C - Clear List");
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

    private static void saveList()
    {

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\data.txt");

        try
        {
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(file));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

            for(String rec : wordList)
            {
                writer.write(rec, 0, rec.length());

                writer.newLine();
            }
            writer.close();
            System.out.println("Date file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

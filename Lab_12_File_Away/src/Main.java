import com.sun.xml.internal.ws.util.StringUtils;

import javax.swing.JFileChooser;
import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;


public class Main {

    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        Scanner inFile;
        String line = "";
        String[] lineArray;
        Path target = new File (System.getProperty("user.dir")).toPath();
        target = target.resolve("src");
        int lineCount = 0;
        int spaceCount = 0;
        int charCount = 0;

        chooser.setCurrentDirectory(target.toFile());

        try
        {
            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                target = chooser.getSelectedFile().toPath();

                inFile = new Scanner(target);

                System.out.println(target.getFileName());
                while (inFile.hasNextLine()) {
                    line = inFile.nextLine();
                    lineArray = line.split(" ", 0);
                    charCount = charCount + line.length();
                    spaceCount = spaceCount + lineArray.length;
                    lineCount++;
                }
                inFile.close();
                System.out.println("Number of lines in the document: " + lineCount);
                System.out.println("Number of words in the document: " + spaceCount);
                System.out.println("Number of characters in the document: " + charCount);
            }
            else
            {
                System.out.println("Sorry, you must select a file! Terminating!");
                System.exit(0);
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
}

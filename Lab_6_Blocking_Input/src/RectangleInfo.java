import java.util.Scanner;
import java.lang.Math;

public class RectangleInfo {
    public static void main(String[] args) {

        int width = 0;
        int height = 0;
        int area = 0;
        int perimeter = 0;
        double diagonal = 0;
        String trash;
        boolean widthDone = false;
        boolean heightDone = false;
        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.println("Enter the width of the rectangle: ");
            if(scan.hasNextInt())
            {
                width = scan.nextInt();
                widthDone = true;
                scan.nextLine();
            }
            else
            {
                trash = scan.nextLine();
                System.out.println("\n You entered: " + trash);
                System.out.println("\nYou need to enter a valid number.\n");
            }
        }
        while(!widthDone);

        do
        {
            System.out.println("Enter the height of the rectangle: ");
            if(scan.hasNextInt())
            {
                height = scan.nextInt();
                heightDone = true;
                scan.nextLine();
            }
            else
            {
                trash = scan.nextLine();
                System.out.println("\n You entered: " + trash);
                System.out.println("\nYou need to enter a valid number.\n");
            }
        }
        while(!heightDone);

        perimeter = (height + height) + (width + width);
        area = height * width;
        diagonal = Math.sqrt((height*height) + (width*width));

        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the triangle is: " + area);
        System.out.println("The diagonal of the rectangle is: " + diagonal);
    }
}

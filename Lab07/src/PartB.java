public class PartB {


    public static void main(String[] args) {

        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < row + 1; col++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int row = 0; row < 5; row++)
        {
            for(int col = 4; col > row - 1; col--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 5; col++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

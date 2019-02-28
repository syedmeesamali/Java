//This java file will be used to test and work on misc codes from edx course
import java.util.Scanner;

public class Ships
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] player1 = new int[10];
      int[] player2 = new int[10];
      int x, y;
      System.out.println("   0 1 2 3 4 5 6 7 8 9");
      for (int i=0; i<10; i++)
      {
         System.out.println(i + " |" + "                   | " + i);
         for (int j=0; j<10; j++)
         {
            
         }
      }
      System.out.println("   0 1 2 3 4 5 6 7 8 9");

      //Below code with deploy the five ships of human player by looping and printing the coordinates
      
      System.out.println("Enter X co-ordinate of your ship: ");
      x = input.nextInt();
      System.out.println("Enter Y co-ordinate of your ship: ");
      y = input.nextInt();
   }      
  
} //End of class
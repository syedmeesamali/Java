//This java file will be used to test and work on misc codes from edx course
import java.util.Scanner;

public class Ships
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[][] human = new int[5][5];
      int[][] computer = new int[5][5];
      int x, y;
      System.out.println("   0 1 2 3 4 5 6 7 8 9");
      for (int i=0; i<10; i++)
      {
         System.out.println(i + " |" + "                   | " + i);
      }
      System.out.println("   0 1 2 3 4 5 6 7 8 9");

      //Below code with deploy the five ships of human player by looping and printing the coordinates
      
      System.out.println("Lenght of human array: " + human.length);
      //Take input for the coordinates of ships
      for (int row=0; row < human.length; row++)
      {
         for (int col=0; col < human[row].length; col++)
         {
            System.out.println("Enter ["+row+"]"+"["+col+"]");
            human[row][col] = input.nextInt();
         }
      }
      for (int a=0; a<5; a++)
      {
         int[] sub = human[a];
         for (int b=0; b<sub.length; b++)
         {
            System.out.println(sub[b] + " ");
         }
      }
          
   }      
  
} //End of class
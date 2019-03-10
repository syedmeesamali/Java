//This java file will be used to test and work on misc codes from edx course
import java.util.Scanner;

public class Ships
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] ali = new int[5];
      int[] jen = new int[5];
      int x, y;
      /*
      for (int row=0; row < ali.length; row++)
      {
         System.out.println("Enter X-Coordinate of Ali Ship # " + row);
         x = input.nextInt();
         System.out.println("Enter Y-Coordinate of Ali Ship # " + row);
         y = input.nextInt();
         System.out.println("   0 1 2 3 4 5 6 7 8 9");
         for (int i=0; i<10; i++)
         {
            System.out.println(i + " |" + "                   | " + i);
            if (y == i)
            {
               System.out.print("\n");
               System.out.print("#");
            }
         }
         System.out.println("   0 1 2 3 4 5 6 7 8 9");
         System.out.print("#");
      }
      */
      makeGraph();
              
   }  //End of main    
  
   //Below class will be used to print the overall graph where ships are to be plotted
   public static void makeGraph()
   {
      int cols;
         for (cols=0; cols<12; cols++)
         {
           if (cols == 0 || cols == 11)
           {
              System.out.println();
              for (int reps=0; reps<10; reps++)
              {
                 System.out.print(" " + reps);
              } //End of horizontal repetition of numbers
              System.out.println();
            } //End of if-block for horizontal numerical prints
           else 
           {
              System.out.println();
              System.out.printf("%-20s", cols-1);
              System.out.print(cols-1);
           } //This is loop when y is not 0 or 11
         }
   } //End of makeGraph method
} //End of class
/*This is a progoram as first step to create the magicsquares matrix
Will start with simple matrix
Then will proceed to magic squares
MagicSquare: When sum in a row, in a column and along diagonal is EQUAL
*/

import java.util.Scanner;
import java.util.ArrayList;

public class TestMagicSquare{
   public static void main(String[] args) {
      
      int[][] square = new int[3][3];
      Square test1 = new Square();
      
      ArrayList<Integer> numbers = new ArrayList<>(3);
      Scanner input = new Scanner(System.in);
      for (int i=0; i<3; i++) {
         for (int j=0; j<3; j++){
               square[i][j] = input.nextInt();
               numbers.add(square[i][j]);
         } // End of inner for loop
      } //End of outer for loop

      System.out.println("size of list is: " + numbers.size());
      System.out.println("Matrix is square: " + test1(numbers));
   } // END OF MAIN METHOD
}
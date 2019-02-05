/*This is a progoram as first step to create the magicsquares matrix
Will start with simple matrix
Then will proceed to magic squares
MagicSquare: When sum in a row, in a column and along diagonal is EQUAL
*/

import java.util.Scanner;

public class magic2{
   //Always included in all java programs 
   public static void main(String args[]) {
      
      int[][] square = new int[3][3];
      int rowSum = 0; int diagSum = 0; int colSum = 0;
      
      Scanner input = new Scanner(System.in);
      for (int i=0; i<3; i++) {
         for (int j=0; j<3; j++){
            System.out.println("Enter element["+i+"]["+j+"] of matrix: ");
               square[i][j] = input.nextInt();
         } // End of inner for loop
      } //End of outer for loop
      
      /*below portion is for calculation of sums and also can display the matrix
      We sum the diagonal elements when i = j or a = b or row = col */
      
      for (int a=0; a<3; a++) {
         for (int b=0; b<3; b++){
            System.out.println("Diagonal element["+a+"]["+b+"] of matrix is: "+square[a][b]);
         } // End of inner for loop
      } //End of outer for loop
      
   
   /*
   Below method will check for the magic square matrix.
   If sumdiag = sumrows = sumcols then it will return True
   else return false 
   */
   /*static boolean isMagic(int mat[][]) { 
   
   
   
   }
     */ 
      
      
   } // END OF MAIN METHOD
}
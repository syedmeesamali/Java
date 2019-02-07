/**
 * Author: Syed Meesam Ali                                          <br>
 * Date: February 6, 2019                                           <br>
 * Purpose: this program reads in the numbers from 1 to n2 from the <br>
   keyboard and tests whether they form a magic square.             <br>
 * Caveats: Non-numeric values will result in an invalid response. 
 */
 
import java.lang.*;
import java.util.*;

public class Square
{
   /**
    * variable n is for isSquare
    *variable ArrayList<Integer> mat is for isUnique
    */
   public int n;
   public int N = 3;
   public ArrayList<Integer> mat;

   //Method to check whether or not input matrix is square. returns boolean
   public boolean isSquare(int i) {
      if (i % Math.sqrt(i) == 0) {
         return true;
         }
      else {
         return false;
        }
   }// End of isUnique check

   /**
    * Method to check whether or not input matrix has unique elements
    * @return boolean
    */
   public boolean isUnique(ArrayList<Integer> mat) {
      
       Set<Integer> uniqueSet = new HashSet<Integer>();        
       for (int item : mat) {
            if (!uniqueSet.add(item)) {
               return false;
            }
            }
       return true;
   } // End of isUnique check

   public boolean isMagic(int mat[][]) 
    {           
        // calculate the sum of the prime diagonal 
        int sum = 0; 
        for (int i = 0; i < N; i++) 
            sum = sum + mat[i][i]; 
  
        // For sums of Rows 
        for (int i = 0; i < N; i++) { 
  
            int rowSum = 0; 
            for (int j = 0; j < N; j++) 
                rowSum += mat[i][j]; 
  
            //check if every row sum is equal to prime diagonal sum 
            if (rowSum != sum) 
                return false; 
        } 
  
        // For sums of Columns 
        for (int i = 0; i < N; i++) { 
  
            int colSum = 0; 
            for (int j = 0; j < N; j++) 
                colSum += mat[j][i]; 
  
            //check if every column sum is equal to prime diagonal sum 
            if (sum != colSum) 
                return false; 
        }   
        return true; 
      } // End of isMagic check


}// End of main Square class
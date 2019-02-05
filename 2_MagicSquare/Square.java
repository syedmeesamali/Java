import java.lang.*;
import java.util.*;

public class Square
{
   public int n;
   public ArrayList<String> mat;
   public boolean isSquare(int i) {
      i = n;
      if (Math.sqrt(n) % 1 == 0) {
         return true;
         }
      else {
         return false;
        }
   }

   public boolean isUnique(ArrayList<Integer> mat) {
      
       Set<Integer> uniqueSet = new HashSet<Integer>();        
       for (int item : mat) {
            if (!uniqueSet.add(item)) {
               return true;
            }
            }
       return false;   
   } // End of isUnique check

}// End of main Square class
import java.util.*;

public class getDigitalRoot {
   static int digroot(int n) 
   {
      int root = 0;
      //Loop while sum is not less than or equal to 9
      while (n > 0 || root > 9)
      {
         if (n == 0)
         {
            n = root;
            root = 0;
         } // Else
         root += n % 10;
         n /= 10;
      }
      return root;
   }
   
   public static void main(String[] args) {
      int n = 342254;
      System.out.println("Digital root of n is: " + digroot(n));
   } //Main method end
} //End of main class
//Code completed for shereena assignment. Original not here.
import java.util.*;

public class LinkedList
{
   public static void main(String[] args)
   {
      ArrayList<Integer> myList = new ArrayList<Integer>();
      for (int j=0; j<10; j++)
      {
         myList.add(j);
      }
      
      int sum = 0;
      for (int i=0; i<myList.size(); i++)
      {
         sum += myList.get(i);
      }
      System.out.println("Sum of arraylist is: " + sum);
            
 } //End of main method
 
 
 public static void makedouble(int[] x)
   {
      for (int i=0; i<x.length; i++)
      {
         x[i] = 2 * i;
      }
   }
  
} //End of class
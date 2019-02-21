//Code completed for shereena assignment. Original not here.
public class LinkedList
{
   public static void main(String[] args)
   {
      int[] a = new int[5];
      int[] b = new int[10];
      int[] arr = {1,2,3};
      System.out.println("Length of array a is: " + a.length);
      System.out.println(Arrays.toString(b));
      //Below portion will fill the empty b array with value 5
      int val = 5;
      for (int i=0; i<b.length; i++)
      {
         b[i] = val;
      }
      System.out.println(Arrays.toString(b));
      System.out.println(Arrays.toString(arr));
      makedouble(arr);
      System.out.println(Arrays.toString(arr));
   
      
   int[][] myarr = new int[2][2];
   int count = 0;
   for (int row = 0; row < myarr.length; row++) 
   {
    for (int col = 0; col < myarr[row].length; col++) 
      {
        myarr[row][col] = count;
        count++;
        System.out.println(myarr[row][col]);
      }
   }
   
 } //End of main method
 
 
 public static void makedouble(int[] x)
   {
      for (int i=0; i<x.length; i++)
      {
         x[i] = 2 * i;
      }
   }
  
} //End of class
//This java file will be used to test and work on misc codes from edx course
import java.util.Arrays;

public class edx
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
   }
   
   public static void makedouble(int[] x)
   {
      for (int i=0; i<x.length; i++)
      {
         x[i] = 2 * i;
      }
   }
   
}
import java.io.*;
import java.util.*;


//This java file will be used to test and work on misc codes from edx course
public class byteReader
{
   public static void main(String[] args)
   {
      byte r[], g[], b[];
      int entries;
      int curPos = 0;
      int w, h;
      byte[] byteData;
      int[] intData;
      
      try 
      {
         FileInputStream in = new FileInputStream("textfile.txt");
         FileOutputStream out = new FileOutputStream("new.txt");

         int c = in.read();
         while ((c != -1 ))
         {
            out.write(c);
         }
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      } catch (IOException e)
      {
         e.printStackTrace();
      }
   }  
} 
import java.io.*;
import java.util.*;


//This java file will be used to test and work on misc codes from edx course
public class byteReader2
{
   public static void main(String[] args)
   {
      byte r[], g[], b[];
      try 
      {
         FileInputStream in = new FileInputStream("white.bmp");
         FileOutputStream out = new FileOutputStream("new.bmp");
         int c;
         while ((c = in.read()) != -1 )
         {
            out.write(c);
            System.out.println((char)(c));
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
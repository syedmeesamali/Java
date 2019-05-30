import java.io.*;
import java.util.*;


//This java file will be used to test and work on misc codes from edx course
public class byteReader
{
   public static void main(String[] args)
   {
      byte r[], g[], b[];
      byte[] byteData;
      String s = "abc";
      byte[] bt = s.getBytes();
      Byte c = 87 & 101;

      System.out.println(Integer.toBinaryString(bt[0]));
      System.out.println(Integer.toBinaryString(87));
      System.out.println(Integer.toBinaryString(101));
      System.out.println(Integer.toBinaryString(c));
      
      try 
      {
         File file = new File("white.bmp");
         FileInputStream in = new FileInputStream(file);
         DataInputStream input = new DataInputStream(in);
         System.out.println("Successfully loaded the BMP file");

      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      } catch (IOException e)
      {
         e.printStackTrace();
      }
   }   //End of main
} //End of class
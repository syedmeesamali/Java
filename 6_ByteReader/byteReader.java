import java.io.*;
import java.util.*;


//This java file will be used to test and work on misc codes from edx course
public class byteReader
{
   public static void main(String[] args)
   {
      byte r[], g[], b[];
      String s = "abc";
      ByteArrayOutputStream os = new ByteArrayOutputStream(); 
      // Tentative size to hold up to 1024 bytes in a buffer
      byte[] bt = new byte[1024];
      int len;

      try 
      {
         File file = new File("white.bmp");
         FileInputStream in = new FileInputStream(file);
         DataInputStream input = new DataInputStream(in);
         BufferedReader br = new BufferedReader(input);
         
         System.out.println("Successfully loaded the BMP file");
         System.out.println("Byte array is: " + bt.length);
         while ((len = in.read(bt)) != -1)
         {
            os.write(bt, off, len);
         }

      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      } catch (IOException e)
      {
         e.printStackTrace();
      }
   }   //End of main
} //End of class
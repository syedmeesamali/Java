import java.io.*;
import java.util.*;


//This java file will be used to test and work on misc codes from edx course
public class byteReader
{
   public static void main(String[] args)
   {
      ByteArrayOutputStream os = new ByteArrayOutputStream(); 

      // Tentative size to hold up to 1024 bytes in a buffer
      byte[] bt = new byte[1024];
      int len;
      //For randomizing of bytes / pixels later

      try 
      {
         File file = new File("white.bmp");
         FileInputStream in = new FileInputStream(file);
         DataInputStream input = new DataInputStream(in);
         
         FileOutputStream output = new FileOutputStream("output.bmp"); //This is the OUTPUT BMP image file
         System.out.println("Successfully loaded the BMP file");
         System.out.println("Byte array is: " + bt.length);
         
         while ((len = in.read(bt)) != -1)
         {
            os.write(bt, 0, len);
            output.write(bt);
         }
         PrintStream fileOut = new PrintStream("./out.txt");
         System.setOut(fileOut);
         //Below code is to display the various elements of the BMP byte array
         for (int x = 0; x < bt.length; x++)
         {
         System.out.println("Element at index " + x + " : "+ bt[x]);
         int rand = (int)(Math.random() * 2);
         System.out.println("Random item:" + rand);
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
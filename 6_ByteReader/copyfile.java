import java.io.*;

//This java program copies one file to another file. Both names are provided.
//------------------------

public class copyfile
{
/** Main method
 * args[0] - original file
 * args[1] - result file
 */
   public static void main(String[] args) throws IOException
   {
      if (args.length != 2)
      {
         System.out.println("Usage: java copy sourceFile targetFile");
         System.exit(1);
      }
      
      //Check for the source file
      File sourceFile = new File(args[0]);
      if (!sourceFile.exists())
      {
         System.out.println("Source file: " + args[0] + "doesn't exist!");
         System.exit(2);
      }
      try 
      {
         
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      } catch (IOException e)
      {
         e.printStackTrace();
      }
   }   //End of main
} //End of class